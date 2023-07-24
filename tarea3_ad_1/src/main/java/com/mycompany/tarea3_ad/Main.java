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
public class Main {

    public static void main(String[] args) {
        /*File file=new File("hibernate.cfg.xml");
        SessionFactory sessionFactory=  new Configuration().configure(file).addAnnotatedClass(Empleados.class).buildSessionFactory();
        Session session=sessionFactory.openSession();
        List<Empleados> persons = session.createNativeQuery(
 "SELECT emp_no, `apellido`, `oficio`, `dir`, `salario`, `comision`, `dept_no` FROM `empleados` ", Empleados.class ).list();
         */
        System.out.println("Aqui llego");
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        do {
            System.out.println("Opción 1: Inserta empleado");
            System.out.println("Opción 2: Modifica empleado");
            System.out.println("Opción 3: Elimina objeto");
            System.out.println("Opción 4: muestra empleados de más de 1000€");
            System.out.println("Opción 0: Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                menu.consulta1();
            } else if (opcion == 2) {
                menu.consulta2();
            } else if (opcion == 3) {
                menu.consulta3();
            } else if (opcion == 4) {
                menu.consulta4();
            } else {
                System.out.println("Debes de poner una opción");
            }
        } while (opcion != 0);

    }
}
