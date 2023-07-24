/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Arrays;

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
        //Arrays.sort(nombres);
        Persona[] personas = new Persona[3];
        personas[0] = new Persona("nombre", "apellidos",
                34);
        personas[1] = new Persona("nombre1", "apellidos1", 15);
        personas[2] = new Persona("nombre2", "apellidos2", 27);
        Arrays.sort(personas);
        for(int i=0;i<personas.length;i++){
            System.out.println(personas[i].getAnyos()+"");
        }
    }

}
