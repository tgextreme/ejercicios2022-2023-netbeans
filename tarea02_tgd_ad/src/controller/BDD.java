/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

//import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Continente;
import model.Pais;

/**
 *
 * @author usuario
 */
public class BDD {

    static Connection conn = null;

    public Connection getConn() {
        return conn;
    }

    public boolean conectar(String bdd, String usuario, String password) {
        try {
            conn
                    = DriverManager.getConnection("jdbc:mysql://localhost/" + bdd + "?"
                            + "user=" + usuario + "&password=" + password);

            // Do something with the Connection
        } catch (Exception ex) {
            // handle any errors
            /* System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());*/
            conn = null;
            return false;
        }

        return true;
    }

    
    public boolean eliminarPais(String pais) {
        Statement stmt = null;
        ResultSet rs = null;
        if (conn == null) {
            return false;
        }
        try {

            
            stmt = conn.createStatement();
            int ok = stmt.executeUpdate("DELETE FROM `pais` WHERE `nombre_pais`='" + pais + "'");
            //rs = stmt.getGeneratedKeys();
            /*   if (rs.next()) {

            } else {
                // throw an exception from here
            }*/
            if (ok > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean insertarContinente(String continente) {
        Statement stmt = null;
        ResultSet rs = null;
        if (conn == null) {
            return false;
        }
        try {

            
            stmt = conn.createStatement();
            int ok = stmt.executeUpdate("INSERT INTO `continente`( `nombre_continente`) VALUES ('" + continente + "')");
            //rs = stmt.getGeneratedKeys();
            /*   if (rs.next()) {

            } else {
                // throw an exception from here
            }*/
            if (ok > 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean insertarPais(String nombrePais, String numHabitantes, String numContinente, String superficieKm2) {
        if (conn == null) {
            return false;
        }

        Statement stmt = null;
        ResultSet rs = null;

        try {

          
            stmt = conn.createStatement();
            String sentencia = "INSERT INTO `pais`(`nombre_pais`, `num_habitantes`, `num_continente`, `superficie_km2`) VALUES ('" + nombrePais + "','" + numHabitantes + "','" + superficieKm2 + "','" + numContinente + "')";
            System.out.println(sentencia);
            int ok = stmt.executeUpdate(sentencia);
            // rs = stmt.getGeneratedKeys();
            /*if (rs.next()) {

            } else {
                // throw an exception from here
            }*/
            if (ok > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {

        }
        return false;
    }

    public ArrayList select(String sql, int numCol) {
        ArrayList<Object> select = new ArrayList<Object>();
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Object> list = new ArrayList<Object>();
        ArrayList<Continente> continente = new ArrayList<Continente>();
        ArrayList<Pais> pais = new ArrayList<Pais>();
        try {
            stmt = conn.createStatement();

            if (stmt.execute(sql)) {
                rs = stmt.getResultSet();
            }

            while (rs.next()) {
                if (numCol == 1) {
                    //System.out.println(rs.getString(2));
                    //list.add(new Object(rs.getString(1),rs.getString(2)));
                    continente.add(new Continente(Integer.parseInt(rs.getString(1)), rs.getString(2)));
                } else if (numCol == 4) {
                    System.out.println(rs.getString(1));
                    pais.add(new Pais(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)));
                }
            }

            // Now do something with the ResultSet ....
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            // it is a good idea to release
            // resources in a finally{} block
            // in reverse-order of their creation
            // if they are no-longer needed

            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException sqlEx) {
                } // ignore

                rs = null;
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException sqlEx) {
                } // ignore

                stmt = null;
            }
        }
        Object[] obj = null;
        if (numCol == 1) {
            return continente;
        } else if (numCol == 4) {
            return pais;
        }
        return null;
    }
}
