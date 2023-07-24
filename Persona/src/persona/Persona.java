/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author usuario
 */
public class Persona implements Comparable<Persona> {

    String nombre;
    String apellido;
    int anyos;

    Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.anyos = dni;
    }

    @Override
    public int compareTo(Persona arg0) {
        int dni = this.getAnyos();
        if (dni == arg0.anyos) {
            return 0;//lo pone al mismo nivel
        } else if (dni > arg0.anyos) {
            return 1;//lo pone delante
        } else {
            return -1;//lo pone hacia atrás
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }

}
