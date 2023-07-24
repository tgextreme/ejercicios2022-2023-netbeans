/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author usuario
 */
public class Continente {
    String nombreContinente;
    int id;
    public Continente(int id, String nombreContinente ){
        this.nombreContinente=nombreContinente;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreContinente() {
        return nombreContinente;
    }
    
}
