/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerfichero;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

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
        File archivo = new File("lectura.txt");
        FileReader fr;
        BufferedReader br;
        ArrayList<Persona> personas = new ArrayList();

        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String l;
            String[] str;
            while ((l = br.readLine()) != null) {
                str = l.split(";");
                personas.add(new Persona(str[0], Integer.parseInt(str[1]), str[2]));
                //System.out.println(str[0]);
            }

        } catch (Exception ex) {

        }
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().equals("Tomas")) {
               personas.remove(i);
                System.out.println("Usuario borrado correctamente");
            }
        }
        
        for (int i = 0; i < personas.size(); i++) {

            System.out.println(personas.get(i).getNombre() + " | " + personas.get(i).getEdad() + " | " + personas.get(i).getLugar());
        }

    }

}
