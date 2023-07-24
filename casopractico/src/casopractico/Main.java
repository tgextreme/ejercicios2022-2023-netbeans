/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casopractico;

import java.time.LocalDate;

/**
 *
 * @author Kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("opcion 1 crear cliente");
        System.out.println("opcion 0 para salir");
        Empresa empresa = new Empresa("usuario@mail.com","calle John Doe", "Carry SL", "622568978");
        Cliente cliente =new Cliente("123456789A", "Pepe","Gonzalez");
        LocalDate fechaConstruccion=LocalDate.of(1999, 5, 29);
        LocalComercial localComercial =new LocalComercial("", 60.5, false, fechaConstruccion, "piso grande", true);
        
    }
    
}
