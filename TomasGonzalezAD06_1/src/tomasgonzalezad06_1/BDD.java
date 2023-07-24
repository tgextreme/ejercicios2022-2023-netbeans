/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasgonzalezad06_1;

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


/**
 *
 * @author usuario
 */
public class BDD {
    public BDD(){
        
    }

    static Connection conn = null;

    public Connection getConn() {
        return conn;
    }

    public boolean accesoBD(String bdd, String usuario, String password) {
        try {
            conn
                    = DriverManager.getConnection("jdbc:mysql://localhost/" + bdd + "?"
                            + "user=" + usuario + "&password=" + password);

            
        } catch (Exception ex) {
          
            conn = null;
            return false;
        }

        return true;
    }
public boolean insertarModulo(String siglasciclo, String siglasModulo, String nombreModulo, String horasSemanales) {
        if (conn == null) {
            return false;
        }

        Statement stmt = null;
        ResultSet rs = null;

        try {

          
            stmt = conn.createStatement();
            String sentencia = "INSERT INTO `modulos`(`siglasciclo`, `siglasmodulo`, `nombremodulo`, `horassemanales`) VALUES ('"+siglasciclo+"','"+siglasModulo+"','"+nombreModulo+"','"+horasSemanales+"')";
            System.out.println(sentencia);
            int ok = stmt.executeUpdate(sentencia);
            
            if (ok > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception ex) {

        }
        return false;
    }
public ArrayList select(String sql) {
        ArrayList<Object> select = new ArrayList<Object>();
        Statement stmt = null;
        ResultSet rs = null;
        ArrayList<Object> list = new ArrayList<Object>();
        ArrayList<Modulo> modulo = new ArrayList();
        
        try {
            stmt = conn.createStatement();

            if (stmt.execute(sql)) {
                rs = stmt.getResultSet();
            }

            while (rs.next()) {
              
                    //System.out.println(rs.getString(2));
                    //list.add(new Object(rs.getString(1),rs.getString(2)));
                    modulo.add(new Modulo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
               
            }

            // Now do something with the ResultSet ....
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            
            return modulo;
        }
    

}
}
