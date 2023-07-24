/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Pisos extends Inmueble {
    private int habitaciones;
    private int baños;

    public Pisos(int habitaciones, int baños, String direccion, double metrosCuadrados, boolean panelesSolares, LocalDate fechaConstruccion, String descripcion) {
        super(direccion, metrosCuadrados, panelesSolares, fechaConstruccion, descripcion);
        this.habitaciones = habitaciones;
        this.baños = baños;
    }

    public Pisos(int habitaciones, int baños, String direccion, double metrosCuadrados, LocalDate fechaConstruccion, String descripcion) {
        super(direccion, metrosCuadrados, fechaConstruccion, descripcion);
        this.habitaciones = habitaciones;
        this.baños = baños;
    }

    public Pisos(int habitaciones, int baños, String direccion, double metrosCuadrados, boolean panelesSolares, LocalDate fechaConstruccion, String descripcion, LocalDate fechaAltaAplicacion) {
        super(direccion, metrosCuadrados, panelesSolares, fechaConstruccion, descripcion, fechaAltaAplicacion);
        this.habitaciones = habitaciones;
        this.baños = baños;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(int habitaciones) {
        this.habitaciones = habitaciones;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }
    
    
    
            
    
}
