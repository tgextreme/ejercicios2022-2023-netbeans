/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3_ad;

import java.io.File;
import java.util.List;
import java.util.Scanner;
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
    public void consulta1() {//esto para añadir usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del empleado");
        String nom_emp = sc.nextLine();
        System.out.println("Dígame un oficio");
        String oficio = sc.nextLine();
        System.out.println("Dime el salario");
        float salario = sc.nextFloat();
        System.out.println("Dime el código de jefe");
        String cod_jefe = sc.nextLine();
        System.out.println("Digame codigo departamento");
        String cod_depto = sc.nextLine();
        try {
            File file = new File("hibernate.cfg.xml");
            SessionFactory sessionFactory = new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
            Session session = sessionFactory.openSession();
            Empleados empleado = new Empleados(nom_emp, oficio, salario, cod_jefe, cod_depto);
            session.beginTransaction();
            session.save(empleado);
            session.getTransaction().commit();
            System.out.println("Usuario añadido correctamnente");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void consulta2() {//esto es para actualizar usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Digame el id");
        String cod_emp = sc.nextLine();
        System.out.println("Dime el nombre del empleado");
        String nom_emp = sc.nextLine();

        System.out.println("Dime el salario");
        float salario = sc.nextFloat();
        System.out.println("Dime el código de jefe");
        String cod_jefe = sc.nextLine();
        System.out.println("Digame codigo departamento");
        String cod_depto = sc.nextLine();
        try {
            File file = new File("hibernate.cfg.xml");
            SessionFactory sessionFactory = new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
            Session session = sessionFactory.openSession();
            Empleados empleado = new Empleados();
            empleado = (Empleados) session.get(Empleados.class, cod_emp);
            empleado.setNom_emp(nom_emp);
            empleado.setSalario(salario);
            empleado.setCod_jefe(cod_jefe);
            empleado.setCod_depto(cod_depto);
            session.getTransaction().commit();
            System.out.println("Usuario añadido correctamnente");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void consulta3() {//esto es para eliminar usuario
        Scanner scanner = new Scanner(System.in);
        File file = new File("hibernate.cfg.xml");
        SessionFactory sessionFactory = new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session = sessionFactory.openSession();
        System.out.println("Dígame el código de empleado");
        String cod_emp = scanner.nextLine();
        Empleados user = new Empleados();
        user = (Empleados) session.get(Empleados.class, 4);
        session.delete(user);
        session.getTransaction().commit();
        System.out.println("Eliminado correctamente");
    }

    public void consulta4() {//esto es para hacer el SELECT que nos pide el ejercicio
        File file = new File("hibernate.cfg.xml");
        SessionFactory sessionFactory = new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session = sessionFactory.openSession();
        List<Empleados> persons = session.createNativeQuery(
                "SELECT `cod_emp`, `nom_emp`, `fecha_ingreso`, `salario`, `cod_jefe`, `cod_depto` FROM `empleado` WHERE salario>1000", Empleados.class).list();
        mostrarEmpleado(persons);
    }

}
