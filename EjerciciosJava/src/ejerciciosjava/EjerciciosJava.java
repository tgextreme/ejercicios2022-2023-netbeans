/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calcular calcular = new Calcular();
        calcular.leerVectorMostrarParesEImpares();
    }

    static void menuleerVectorMostrarMayorMenorRepetido() {
        Calcular calcular = new Calcular();
        calcular.leerVectorMostrarMayorMenorRepetido();
    }

    static void menuMultiplicacionRusa() {
        Calcular calcular = new Calcular();
        String str = calcular.multiplicacionRusa(31, 27);
        System.out.println(str);
    }

    static void menuNumeroMenorMayorN() {
        Calcular calcular = new Calcular();
        int numero = calcular.menorN(9857);
        System.out.println(numero);
    }

    static void menuNumeroReves() {
        Calcular calcular = new Calcular();
        String str = calcular.numeroReves(1234);
        System.out.println(str);
    }

    static void menuRaizDigital() {
        Calcular calcular = new Calcular();

        int i = calcular.raizDigital(347);
        System.out.println(i);
    }

    static void menuApilarMismoTamanyo() {
        Calcular calc = new Calcular();
        boolean a = calc.apilarMismoTamanyo(37);
        System.out.println(a + "");
    }

    static void menuPiramideAst() {
        int i = 5;
        Calcular calc = new Calcular();
        System.out.println("Dígame la cantidad de productos:");
        boolean pir = calc.piramideAsteriscos(6);
        if (pir) {
            System.out.println("Es válido");
        } else {
            System.out.println("No es válido");
        }

    }

    static void menuNumPrimo() {
        int i, numCar;
        Calcular calc = new Calcular();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dígame un dígito");
        i = scanner.nextInt();
        numCar = calc.numeroDeDigitos(i);
        System.out.println("El número de dígitos es " + numCar);
    }

    static void menuPotencia() {
        Scanner scanner = new Scanner(System.in);
        int x, n;
        Calcular calcular = new Calcular();
        double potencia;
        System.out.println("Dígame el número X:");
        x = scanner.nextInt();
        System.out.println("Dígame la potencia N:");
        n = scanner.nextInt();
        potencia = calcular.enesimaPot(x, n);
        System.out.println("X: " + x + " N: " + n + " es igual a " + potencia);
    }

    static void menuContadorDiez() {
        Calcular calc = new Calcular();

        int contador = calc.conNumDeDie();

        System.out.println("El número de diez es " + contador);
    }

    static void menuSegundos() {
        // TODO code application logic here
        int horas, minutos, segundos, total;
        Scanner sca = new Scanner(System.in);
        Calcular calcular = new Calcular();
        System.out.println("Dígame horas");
        horas = sca.nextInt();
        System.out.println("Dígame minutos");
        minutos = sca.nextInt();
        System.out.println("Dígame segundos");
        segundos = sca.nextInt();
        total = calcular.calcularSegundos(horas, minutos, segundos);
        System.out.println(total + " segundos ");
    }

    static void menuOrdenar() {
        System.out.println("Dígame 3 números");
        Scanner sca = new Scanner(System.in);
        int a, b, c;
        Calcular cal = new Calcular();
        /*
        
        System.out.println("Dígame el primer número");
        a=sca.nextInt();
        
        System.out.println("Dígame el segundo número");
        b=sca.nextInt();
        
        
        System.out.println("Dígame el tercer número");
        c=sca.nextInt();
         */
        a = 50;
        b = 70;
        c = 80;
        String str = cal.ordenarTresNumeros(a, b, c);
        System.out.println(str);

        a = 50;
        b = 80;
        c = 70;
        str = cal.ordenarTresNumeros(a, b, c);
        System.out.println(str);

        a = 80;
        b = 50;
        c = 90;
        str = cal.ordenarTresNumeros(a, b, c);
        System.out.println(str);

        a = 80;
        b = 50;
        c = 40;
        str = cal.ordenarTresNumeros(a, b, c);
        System.out.println(str);

        System.out.println(str);
    }
}
