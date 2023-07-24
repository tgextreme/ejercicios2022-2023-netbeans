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
public class Contrato {

    private double importe;
    private Inmueble inmueble;
    private LocalDate fechaFirma;
    private double fianza;
    private double ibi;
    private Documentacion documentacion;

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public LocalDate getFechaFirma() {
        return fechaFirma;
    }

    public void setFechaFirma(LocalDate fechaFirma) {
        this.fechaFirma = fechaFirma;
    }

    public double getFianza() {
        return fianza;
    }

    public void setFianza(double fianza) {
        this.fianza = fianza;
    }

    public double getIbi() {
        return ibi;
    }

    public void setIbi(double ibi) {
        this.ibi = ibi;
    }

    public Documentacion getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(Documentacion documentacion) {
        this.documentacion = documentacion;
    }

    public Contrato(double importe, Inmueble inmueble, LocalDate fechaFirma, double fianza, double ibi, Documentacion documentacion) {
        this.importe = importe;
        this.inmueble = inmueble;
        this.fechaFirma = fechaFirma;
        this.fianza = fianza;
        this.ibi = ibi;
        this.documentacion = documentacion;
    }

    public double getPrecioFinal() {
        return importe * 1.21;
    }

}
