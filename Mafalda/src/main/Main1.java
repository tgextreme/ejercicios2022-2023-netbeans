/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main1 {

    /*public static construir(HashMap){
        
    }*/
    public static int[] consumir(HashMap<String, Integer> hashMap) {
        int[] resultado = new int[2];
        ArrayList<String> arrayList = new ArrayList();
        if (hashMap.containsKey("Mafalda") && hashMap.size() > 2) {

            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap.put((String) entry.getKey(), hashMap.get(entry.getKey()) - 1);
                arrayList.add((String) entry.getKey());
            }

            for (String nombre : arrayList) {
                if (hashMap.get(nombre) == 0) {
                    hashMap.remove(nombre);
                }
            }
            resultado[0] = 1;
            resultado[1] = arrayList.size();

        }

        return resultado;

    }

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int personajes, total, retratados, fotos, espera;
        HashMap<String, Integer> hashMap = new HashMap();
        String persona;
        int[] resultado;
        while ((personajes = sca.nextInt()) != 0) {
            hashMap.clear();
            total = 0;
            fotos = 0;
            retratados=0;
            for (int i = personajes; i > 0; i--) {
                persona = sca.next();

                if (hashMap.containsKey(persona)) {
                    hashMap.put(persona, hashMap.get(persona) + 1);
                } else {
                    hashMap.put(persona, 1);
                }
                total = total + 1;
                resultado = consumir(hashMap);
                fotos = fotos + resultado[0];
                retratados=retratados+resultado[1];
            }
            System.out.println(fotos+" "+(total-retratados));

         
        }

    }

}
