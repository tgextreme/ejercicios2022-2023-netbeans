/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3_ad;

import java.io.File;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author usuario
 */
public class Menu {
    public void mostrarEmpleado(List<Empleados> emp){
        for(Empleados e:emp){
            System.out.println(e.toString());
        }
        
    }
    public void consulta1(){
               File file=new File("hibernate.cfg.xml");
        SessionFactory sessionFactory=  new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Empleados> persons = session.createNativeQuery(
 "SELECT `emp_no`, `apellido`, `oficio`, `dir`, `salario`, `comision`, `dept_no` FROM `empleados` " +
"where salario > 1600 ", Empleados.class ).list();
        mostrarEmpleado(persons);
    }
    public void consulta2(){
         File file=new File("hibernate.cfg.xml");
        SessionFactory sessionFactory=  new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Empleados> persons = session.createNativeQuery(
 "SELECT `emp_no`,  `salario`, `dept_no` FROM `empleados`  " +
"ORDER BY salario DESC", Empleados.class ).list();
        mostrarEmpleado(persons);
    }
    public void consulta3(){
        File file=new File("hibernate.cfg.xml");
        SessionFactory sessionFactory=  new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Empleados> persons = session.createNativeQuery(
 "SELECT `emp_no`, `apellido`, `oficio`, `dir`, `salario`, `comision`, `dept_no` FROM `empleados` where dept_no != 20", Empleados.class ).list();
        mostrarEmpleado(persons);
    }
    public void consulta4(){
        File file=new File("hibernate.cfg.xml");
        SessionFactory sessionFactory=  new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Empleados> persons = session.createNativeQuery(
 "SELECT `emp_no`, `apellido`, `oficio`, `dir`, `salario`, `comision`, `dept_no` FROM `empleados` where salario>(select max(salario) from empleados where dept_no=10)", Empleados.class ).list();              
        mostrarEmpleado(persons);
    }
    public void consulta5(){
        File file=new File("hibernate.cfg.xml");
        SessionFactory sessionFactory=  new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Empleados> persons = session.createNativeQuery(
 "SELECT `emp_no`, `apellido`, `oficio`, `dir`, `salario`, `comision`, `dept_no` FROM `empleados` where dept_no != 20", Empleados.class ).list();              
    mostrarEmpleado(persons);}
    public void consulta6(){
        
    }
    
}
