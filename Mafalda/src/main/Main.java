/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    public static void main(String[] args) {
        String[] personajes = new String[7];
        personajes[0] = "Mafalda";
        personajes[1] = "Felipe";
        personajes[2] = "Manolito";
        personajes[3] = "Susanita";
        personajes[4] = "Miguelito";
        personajes[5] = "Libertad";
        personajes[6] = "Guille";

        Scanner sc = new Scanner(System.in);
        String opciones = sc.nextLine();
        String[] elementos = opciones.split(" ");
        int mafalda = 0;
        int felipe = 0;
        int manolito = 0;
        int susanita = 0;
        int miguelito = 0;
        int libertad = 0;
        int guille = 0;
        for (String str : elementos) {
            if (str.equals("Mafalda")) {
                mafalda++;
            } else if (str.equals("Felipe")) {
                felipe++;
            } else if (str.equals("Manolito")) {
                manolito++;
            } else if (str.equals("Susanita")) {
                susanita++;
            } else if (str.equals("Miguelito")) {
                miguelito++;
            } else if (str.equals("Libertad")) {
                libertad++;
            } else if (str.equals("Guille")) {
                guille++;
            }
        }
        
        
        
        if(mafalda>1 || felipe>1 && manolito>1 && susanita>1 && miguelito>1 && libertad>1 && guille>1){
            System.out.println("Debe de haber un sólo personaje de cada cosa"); 
            
        }
       

    }

}
