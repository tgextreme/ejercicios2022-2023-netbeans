/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package javaapplication32;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ivanb
 */
public class Dia13 {

    static ArrayList<Usuario> usuarios = new ArrayList();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre, apellido, dni;
        nombre = "";
        apellido = "";
        dni = "";
        System.out.println("cuantos usuarios quieres crear");
        int numero = Integer.parseInt(sc.next());
        for (int i = 0; i < numero; i++) {
            anyadir();
        }
    }

    static void anyadir() {
        String nombre, apellido, dni;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribeme el nombre");
        nombre = sc.nextLine();
        System.out.println("Escribeme el apellido");
        apellido = sc.nextLine();
        System.out.println("Escribeme el dni");
        dni = sc.nextLine();
        usuarios.add(new Usuario(nombre, apellido, dni));
    }
}
