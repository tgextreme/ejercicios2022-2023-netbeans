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
public class Usuario {

    private String nombre;
    private String contrasenya;
    private LocalDate fechaNacimiento;
   
    public Usuario(){
        
    }

    public Usuario(String nombre, String contrasenya, LocalDate fechaNacimiento) {
        this.nombre=nombre;
        this.contrasenya=contrasenya;
        this.fechaNacimiento=fechaNacimiento;
        

    }

    public double perimetroCuadrado(double lado){
       double total=lado*4;
       return total;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    

}
