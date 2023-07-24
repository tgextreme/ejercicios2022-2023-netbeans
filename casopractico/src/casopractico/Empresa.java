/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casopractico;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Empresa {

    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;
    private static ArrayList<Inmueble> inmuebles;

    public Empresa(String nombre, String direccion, String telefono, String correoElectronico) {
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;

    }
    
    public ArrayList<Pisos> selecciónInmueble(double metrosCuadradosMin, double metrosCuadradosMax, int habitacionesMin, int habitacionesMax, boolean panelesSolares){
        ArrayList<Pisos> nuevo =new ArrayList();
        ArrayList<Pisos> nuevoCaracteristicas =new ArrayList();
        for(Inmueble i:this.inmuebles){
            if(i instanceof Pisos){
                nuevo.add((Pisos)i);
            }
        }
        for(Pisos p:nuevo){
            if(p.getMetrosCuadrados()>metrosCuadradosMin && p.getMetrosCuadrados()<metrosCuadradosMax && p.getHabitaciones()>=habitacionesMin && p.getHabitaciones()<=habitacionesMax && panelesSolares){
                nuevoCaracteristicas.add(p);
            }
        }
        
        return nuevoCaracteristicas;
    }
    public void añadirInmueble (Inmueble inmueble){
        this.inmuebles.add(inmueble);
    }

}
