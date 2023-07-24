/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class FotoMafalda {

    // Devuelvo en la posición 0 del vector un 1 si se pudo hacer la foto
    // En la posición 1, figura el número de niños que salieron en la foto
    private static int[] consumir(HashMap<String, Integer> map) {
        int[] resultado = new int[2];
        ArrayList<String> lista = new ArrayList();

        String numero = "1234";

        //if (map.containsKey("Mafalda") || map.containsKey("Felipe") || map.containsKey("Manolito") || map.containsKey("Susanita") || map.containsKey("Miguelito") || map.containsKey("Libertad") || map.containsKey("Guille")) {
        // 
        if (map.containsKey("Mafalda") && map.size() > 2) {
            for (Map.Entry entry : map.entrySet()) {
                map.put((String) entry.getKey(), map.get(entry.getKey()) - 1);
                lista.add((String) entry.getKey());
            }
            for (String nombre : lista) {
                if (map.get(nombre) == 0) {
                    map.remove(nombre);
                }
            }
            resultado[0] = 1;
            resultado[1] = lista.size();
        }
        return resultado;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int personajes, fotos, total, retratados;
        HashMap<String, Integer> map = new HashMap();
        String personaje;
        int[] resultado;
        personajes = personajes = in.nextInt();
        while (personajes != 0) {
            map.clear();
            fotos = 0;
            total = 0;
            retratados = 0;
            while (personajes - 1 > 0) {
                personaje = in.next();
                if (map.containsKey(personaje)) {
                    map.put(personaje, map.get(personaje) + 1);
                } else {
                    map.put(personaje, 1);
                }
                total++;
                resultado = consumir(map);
                fotos = fotos + resultado[0];
                retratados = retratados + resultado[1];
            }
            System.out.println(fotos + " " + (total - retratados));
            personajes = in.nextInt();
        }
    }
}
