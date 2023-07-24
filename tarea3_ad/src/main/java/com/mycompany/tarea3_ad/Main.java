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

        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        do {
            System.out.println("Consulta 1: Apellido, salario y número de empleado con un salario inferior a 1600.\n"
                    + "Consulta 2: Número de empleado, departamento y salario de los empleados, ordenados de menor a mayor salario.\n"
                    + "Consulta 3: Datos de empleados cuyo departamento no esté en GRANADA.\n"
                    + "Consulta 4: Apellido, salario y número de departamento de los empleados cuyo salario sea mayor que el máximo salario del departamento 10.\n"
                    + "Consulta 5: Empleados con salario menor que alguno de los empleados del departamento 20.\n"
                    + "Consulta 6: Mostrar nombre y total de empleados de aquellos departamentos con más de un empleado adscrito. Ordena el resultado por número de empleado.");

            System.out.println("Consulta 0: Salir");
            opcion = sc.nextInt();
            if (opcion == 1) {
                menu.consulta1();
            } else if (opcion == 2) {
                menu.consulta2();
            } else if (opcion == 3) {
                menu.consulta3();
            } else if (opcion == 4) {
                menu.consulta4();
            } else if (opcion == 5) {
                menu.consulta5();
            } else if (opcion == 6) {
                menu.consulta6();
            } else {
                System.out.println("Debes de poner una opción");
            }
        } while (opcion != 0);

        System.out.println("Aqui llego");

    }
}
