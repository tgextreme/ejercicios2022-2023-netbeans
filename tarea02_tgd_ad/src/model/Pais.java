/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author usuario
 */
public class Pais {
    String nombrePais,	numHabitantes,	numContinente,	superficieKm2;

    public Pais(String nombrePais, String numHabitantes, String numContinente, String superficieKm2) {
        this.nombrePais = nombrePais;
        this.numHabitantes = numHabitantes;
        this.numContinente = numContinente;
        this.superficieKm2 = superficieKm2;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(String numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public String getNumContinente() {
        return numContinente;
    }

    public void setNumContinente(String numContinente) {
        this.numContinente = numContinente;
    }

    public String getSuperficieKm2() {
        return superficieKm2;
    }

    public void setSuperficieKm2(String superficieKm2) {
        this.superficieKm2 = superficieKm2;
    }
    
    
}
