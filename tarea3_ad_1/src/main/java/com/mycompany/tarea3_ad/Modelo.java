/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3_ad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author usuario
 */
public class Modelo {
    
    public String sentenciaSQL(double salario){
        
        SessionFactory sessionFactory=  new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        try{
            
        }catch(Exception ex){
            
        }
        return "";
    }
}
