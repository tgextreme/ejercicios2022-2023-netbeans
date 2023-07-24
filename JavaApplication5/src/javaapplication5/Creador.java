/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.time.LocalDate;

/**
 *
 * @author usuario
 */
public class Creador extends Usuario {

    private boolean normasComunidad;
    private String paypal;
    private String tipo;

    public Creador(String nombre, String contrasenya, LocalDate fechaNacimiento, boolean normasComunidad, String paypal, String tipo) {
        super(nombre, contrasenya, fechaNacimiento);
        this.normasComunidad=normasComunidad;
        this.paypal=paypal;
        this.tipo=tipo;
    }

    public void setNormasComunidad(boolean normasComunidad) {
        this.normasComunidad = normasComunidad;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isNormasComunidad() {
        return normasComunidad;
    }

    public String getPaypal() {
        return paypal;
    }

    public String getTipo() {
        return tipo;
    }
    

}
