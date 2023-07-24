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
public class LocalComercial extends Inmueble {
    
    private boolean licenciaApertura;

    public boolean isLicenciaApertura() {
        return licenciaApertura;
    }

    public void setLicenciaApertura(boolean licenciaApertura) {
        this.licenciaApertura = licenciaApertura;
    }
    public LocalComercial(String direccion, double metrosCuadrados, boolean panelesSolares, LocalDate fechaConstruccion, String descripcion, boolean licenciaApertura) {
        super(direccion, metrosCuadrados, panelesSolares, fechaConstruccion, descripcion);
        this.licenciaApertura=licenciaApertura;
    }
    
    public LocalComercial(String direccion, double metrosCuadrados, LocalDate fechaConstruccion, String descripcion, boolean licenciaApertura) {
        super(direccion, metrosCuadrados, fechaConstruccion, descripcion);
        this.licenciaApertura=licenciaApertura;
    }

    public LocalComercial(boolean licenciaApertura, String direccion, double metrosCuadrados, boolean panelesSolares, LocalDate fechaConstruccion, String descripcion, LocalDate fechaAltaAplicacion) {
        super(direccion, metrosCuadrados, panelesSolares, fechaConstruccion, descripcion, fechaAltaAplicacion);
        this.licenciaApertura = licenciaApertura;
    }
    
    
}
