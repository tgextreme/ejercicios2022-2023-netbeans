/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasgonzalezad06;

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

    
   
}
