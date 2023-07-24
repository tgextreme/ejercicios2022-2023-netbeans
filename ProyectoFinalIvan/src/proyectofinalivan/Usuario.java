/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalivan;

/**
 *
 * @author usuario
 */
public class Usuario {

    private String nombre;
    private String dni;
    private int edad;
    private char sexo;
    private double imc;
    private Respuestas respuestas;

    public Usuario(String nombre, String dni, int edad, char sexo) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.sexo = sexo;
    }

    public void gestionarRespuestas(){
        
    }
    public Respuestas getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Respuestas respuestas) {
        this.respuestas = respuestas;
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
