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
public class Inmueble {

    private String direccion;
    private double metrosCuadrados;
    private boolean panelesSolares;
    private LocalDate fechaConstruccion;
    private String descripcion;
    private LocalDate fechaAltaAplicacion;

    public Inmueble(String direccion, double metrosCuadrados, boolean panelesSolares, LocalDate fechaConstruccion, String descripcion, LocalDate fechaAltaAplicacion) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.panelesSolares = panelesSolares;
        this.fechaConstruccion = fechaConstruccion;
        this.descripcion = descripcion;
        this.fechaAltaAplicacion = fechaAltaAplicacion;
    }

    public Inmueble(String direccion, double metrosCuadrados, boolean panelesSolares, LocalDate fechaConstruccion, String descripcion) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.panelesSolares = panelesSolares;
        this.fechaConstruccion = fechaConstruccion;
        this.descripcion = descripcion;
    }

    public Inmueble(String direccion, double metrosCuadrados, LocalDate fechaConstruccion, String descripcion) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.fechaConstruccion = fechaConstruccion;
        this.descripcion = descripcion;
    }

    public void calcularPrecioMercado() {

    }

    public String getDireccion() {
        return direccion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public boolean isPanelesSolares() {
        return panelesSolares;
    }

    public LocalDate getFechaConstruccion() {
        return fechaConstruccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getAntiguedad() {
        LocalDate lt
                = LocalDate.now();

        int numeroAños= (int)lt.getYear()-this.fechaAltaAplicacion.getYear();
        return numeroAños;
    }
}
