/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class OriMaf {
    // Devuelvo en la posición 0 del vector un 1 si se pudo hacer la foto
    // En la posición 1, figura el número de niños que salieron en la foto

    private static int[] consumir(HashMap<String, Integer> map) {
        int[] resultado = new int[2];
        LinkedList<String> lista = new LinkedList();

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

        while ((personajes = in.nextInt()) != 0) {
            map.clear();
            fotos = 0;
            total = 0;
            retratados = 0;
            //while (personajes-->0)

            for (int i = personajes; i > 0; i--) {
                personaje = in.next();
                if (map.containsKey(personaje)) {
                    map.put(personaje, map.get(personaje) + 1);
                } else {
                    map.put(personaje, 1);
                }
                total++;
                resultado = consumir(map);
                fotos += resultado[0];
                retratados += resultado[1];
            }
            System.out.println(fotos + " " + (total - retratados));
        }
    }
}
