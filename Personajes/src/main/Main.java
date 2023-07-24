/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author usuario
 */
public class Main {
    public static void main(String[] args) {
        /*HashMap <String, String> paises;
        paises = new HashMap<String, String>();
        paises.put("IN", "India");
        paises.put("CH", "China");
        System.out.println(paises.get("IN"));*/
        /*HashSet <String> paises = new HashSet<String>();
       paises.add("India");
       paises.add("China");
       paises.remove("India");
        System.out.println(paises.contains("China"));*/
        ArrayList <String> str=new ArrayList();
        str.add("palabra");
        str.add("palabra");
        str.add("palabra");
        str.add("palabra");
        str.add("palabra");
    //    String [] palabras=new String[str.size()];
      //  int i=0;
        Iterator iterator =str.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        
        
        
        
    }
}
