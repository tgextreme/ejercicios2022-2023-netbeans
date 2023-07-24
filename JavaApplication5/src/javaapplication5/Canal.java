/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author usuario
 */
public class Canal {

    private String tipo;
    private String nombre;

    Canal(String tipo, String nombre) {
        this.tipo=tipo;
        this.nombre=nombre;
                
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
    

}
