/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author usuario
 */
public class Calcular {

    /**
     * 25.- Con el mismo vector del ejercicio anterior. Programa que calcula e
     * imprime las sumas de las componentes de índice par y las de índice impar
     */
    public void leerVectorMostrarParesEImpares() {
        Scanner sca = new Scanner(System.in);
        int[] vector = new int[50];
        int numImpar, numPar;
        numImpar = 0;
        numPar = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = sca.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] % 2 == 0) {
                numPar = numPar + 1;
            } else {
                numImpar = numImpar + 1;
            }
        }
        System.out.println("El número par tiene " + numPar + " repeticiones");
        System.out.println("El número impar tiene " + numImpar + " repeticiones");
    }

    /**
     * 24.- Programa que lee 50 números enteros sobre un vector y obtiene e
     * imprime cuáles son el mayor y el menor número almacenados y cuántas veces
     * se repiten ambos
     */
    public void leerVectorMostrarMayorMenorRepetido() {
        Scanner sca = new Scanner(System.in);
        int[] vector = new int[50];
        int numMenor, numMayor, repMenor, repMayor;
        for (int i = 0; i < vector.length; i++) {
            vector[i] = sca.nextInt();
        }
        Arrays.sort(vector);
        numMenor = vector[0];
        numMayor = vector[vector.length - 1];
        repMenor = 0;
        repMayor = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numMenor) {
                repMenor = repMenor + 1;
            }
            if (vector[i] == numMayor) {
                repMayor = repMayor + 1;
            }
        }
        System.out.println("El número menor es " + numMenor + " con " + repMenor + " repeticiones");
        System.out.println("El número mayor es " + numMayor + " con " + repMayor + " repeticiones");
    }

    /**
     * 23.- Construir un algoritmo que permita multiplicar dos números enteros
     * positivos empleando el método denominado MULTIPLICACIÓN RUSA. Este método
     * permite calcular el producto de M*N de la siguiente manera: En pasos
     * sucesivos se divide M por 2 (división entera) y se multiplica N por 2.
     * Este proceso se repite hasta que M es 0. El resultado de la
     * multiplicación deseada se obtiene acumulando aquellos valores sucesivos
     * de N para los cuales el valor de M es impar:
     *
     */
    public String multiplicacionRusa(int m, int n) {
        String acumulado = m + "";
        String acumuladoFinal = "";
        while (n != 0) {
            m = m * 2;
            acumulado = acumulado + "+" + m;
            n = n / 2;
        }

        for (int i = 0; i < acumulado.length(); i++) {
            acumuladoFinal = acumuladoFinal + acumulado.charAt(i);
        }

        return acumuladoFinal;
    }

    /**
     * 22.- Escribir un programa que lea un número natural de 4 cifras, no todos
     * iguales. Implementa la función Mayor(N), que calcula el mayor número que
     * se puede formar con las cifras de N, y la función Menor(N) que calcula el
     * menor número que se puede formar con las cifras de N
     *
     * @param numero
     * @return
     */
    public int mayorN(int numero) {

        String intermedio = "";
        String numeroStr = numero + "";
        String numerosStr[] = numeroStr.split("");
        int[] numeros = new int[numerosStr.length];
        int[] numeros1 = new int[numerosStr.length];
        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }
        Arrays.sort(numeros);

        for (int i = numeros1.length - 1; i >= 0; i--) {
            numeros1[i] = numeros[i];

        }

        for (int i = 0; i < numeros1.length; i++) {
            intermedio = intermedio + numeros1[i];
        }

        return Integer.parseInt(intermedio);
    }

    public int menorN(int numero) {

        String intermedio = "";
        String numeroStr = numero + "";
        String numerosStr[] = numeroStr.split("");
        int[] numeros = new int[numerosStr.length];

        for (int i = 0; i < numerosStr.length; i++) {
            numeros[i] = Integer.parseInt(numerosStr[i]);
        }
        Arrays.sort(numeros);

        for (int i = 0; i < numeros.length; i++) {
            intermedio = intermedio + numeros[i];
        }

        return Integer.parseInt(intermedio);
    }

    /**
     * 21.-Escribe un programa C que, dado un número entero positivo y lo
     * devuelva al revés. Por ejemplo, si el número de entrada es 1234, la
     * rutina debería devolver 4321
     *
     */
    public String numeroReves(int numero) {

        String intermedio = "";
        String numeroStr = numero + "";
        for (int i = numeroStr.length() - 1; i != -1; i--) {
            intermedio = intermedio + numeroStr.charAt(i);
        }

        return intermedio;

    }

    /**
     * 20.- Dado un número natural N, se calcula la raíz digital de N sumando
     * los dígitos que lo componen. El proceso se repite sobre el nuevo número
     * hasta que el resultado obtenido tiene un sólo dígito. Este último número
     * es la raíz digital del número N. Ejemplo: 347 Æ3 + 4 + 7 = 14 Æ 1 + 4 Æ 5
     * Æ Raíz digital (347) = 5. Escribir un programa C que calcule la raíz
     * digital de un número
     *
     */
    public int raizDigital(int numero) {
        String numeroStr = numero + "";
        int total = 0;
        int intermedio = 0;
        for (int i = 0; i < numeroStr.length(); i++) {
            intermedio = Integer.parseInt(numeroStr.charAt(i) + "");
            total = total + intermedio;
        }

        if ((total + "").length() != 1) {
            total = raizDigital(total);
        }

        return total;
    }

    /**
     * 19.- En el mismo supermercado quieren montar también pilas del mismo
     * número de latas de alto que de ancho. * * * * * * Ahora bien no todas las
     * cantidades de latas que pueden apilarse triangularmente pueden ponerse en
     * estructuras cuadradas. Diseñas un programa C que indique si un número
     * natural es válido para realizar los dos tipos de estructuras. (Un ejemplo
     * válido es el número 36)
     */
    boolean apilarMismoTamanyo(int cantidad) {
        double resultado = Math.sqrt(cantidad);
        int resultadoEntero = (int) resultado;
        double solucion = resultado - resultadoEntero;
        if (solucion == 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean piramideAsteriscos(int ast) {
        int total = 0;
        boolean check = false;
        for (int i = 0; i <= ast; i++) {
            for (int o = 0; o < i; o++) {
                total = total + 1;
            }
            if (total == ast) {
                return true;
            }

        }
        return false;
    }

    public void piramideNumeros(int numero) {
        for (int i = 0; i <= numero; i++) {
            for (int o = 0; o < i; o++) {
                System.out.print(i);
            }
            System.out.println("");
        }

    }

    public int numeroDeDigitos(int i) {
        String str = i + "";
        return str.length();
    }

    public String rectaInterseccion(int a1, int a2, int b1, int b2) {
        int menor1, menor2;

        if (a1 < b1) {
            menor1 = a1;
        } else {
            menor1 = a2;
        }

        if (a2 < b2) {
            menor2 = b1;
        } else {
            menor2 = b2;
        }

        return menor1 + " " + menor2;
    }

    public double enesimaPot(int x, int n) {

        return Math.pow(x, n);

    }

    public int conNumDeDie() {
        int i = 0;
        int contador = 0;
        Scanner sca = new Scanner(System.in);
        while (i != -1) {
            System.out.println("Dígame un número");
            i = sca.nextInt();
            if (i == 10) {
                contador = contador + 1;
            }

        }

        return contador;
    }

    public int calcularSegundos(int horas, int minutos, int segundos) {
        int total = 0;

        total = (horas * 60 * 60) + (minutos * 60) + segundos;

        return total;
    }

    public String ordenarTresNumeros(int a, int b, int c) {
        String str = "";
        if (a < b) {
            if (b < c) {
                System.out.println("1");
                str = a + " " + b + "  " + c + " ";
            } else {
                System.out.println("2");
                str = a + " " + c + "  " + b + " ";
            }

        } else {
            if (b > c) {
                System.out.println("3");
                str = c + " " + b + "  " + a + " ";
            } else {
                System.out.println("4");
                str = b + " " + a + " " + c + "  ";
            }
        }

        return str;
    }

}
