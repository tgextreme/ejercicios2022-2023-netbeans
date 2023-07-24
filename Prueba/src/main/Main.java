/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
       /*     int i=115;
            while(i>0){
                i=i/2;
                System.out.println(i+"");
            }*/
            for(int i=0;i<10;i++){
                
            }
           // metodoInput();
        
            /*Scanner sc = new Scanner(System.in);
            int numero;

            System.out.println("Digame un numero");
            numero = sc.nextInt();
            if (numero < 0) {
                throw new ArithmeticException();
            }*/
        } catch (ArithmeticException ex) {
            System.out.println("Has puesto mal el número");

        } catch (InputMismatchException ex) {
            System.out.println("Debes poner un número");
        } catch (Exception ex) {
            System.out.println("Error de código " + ex.getMessage());
        }
    }

    static void metodoInput() throws ArithmeticException{

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digame un numero");
        numero = sc.nextInt();
        if (numero < 0) {
            throw new ArithmeticException();

        }

    }
    
}
