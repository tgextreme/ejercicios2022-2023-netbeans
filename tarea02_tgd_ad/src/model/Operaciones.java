/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.BDD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class Operaciones {
    
  public String getTextSql(String sql,int numCol){
      BDD dbb=new BDD();
      /*Object[] obj=  dbb.select(sql, numCol);
      
      for(int i=0;i<obj.length;i++){
          /*for(int j=0;j<select.get(i)[j];j++){
              
          }*/
      
      String str="";
      
      
       
        return "";
    }
 public String getNumHabCont(){
     Statement stmt = null;
        ResultSet rs = null;
        BDD bdd=new BDD();
     Connection conn=bdd.getConn();
     String str="";
     try {
            stmt = conn.createStatement();

            if (stmt.execute("select continente.nombre_continente, sum(`num_habitantes`) from pais, continente where pais.num_continente=continente.num_continente GROUP by continente.num_continente")) {
                rs = stmt.getResultSet();
            }

            while (rs.next()) {
                
                str=str+rs.getString(1)+" "+ rs.getString(2)+" Habitantes \n";
                
            }

            // Now do something with the ResultSet ....
        } catch (Exception ex) {
            // handle any errors
           
        }
     return str;
 }   
 
  public String getNumSupKm2(){
     Statement stmt = null;
        ResultSet rs = null;
        BDD bdd=new BDD();
     Connection conn=bdd.getConn();
     String str="";
     try {
            stmt = conn.createStatement();

            if (stmt.execute("select continente.nombre_continente, sum(pais.superficie_km2) from pais, continente WHERE continente.num_continente=pais.num_continente group by continente.num_continente")) {
                rs = stmt.getResultSet();
            }

            while (rs.next()) {
                
                str=str+rs.getString(1)+" "+ rs.getString(2)+" KM2\n";
                
            }

            // Now do something with the ResultSet ....
        } catch (Exception ex) {
            // handle any errors
           
        }
     return str;
 } 
}