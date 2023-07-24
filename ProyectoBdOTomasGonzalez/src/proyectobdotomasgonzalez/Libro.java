/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectobdotomasgonzalez;

/**
 *
 * @author usuario
 */
public class Libro {
    private String titulo, editorial, tipo;
    private double precio;

    public Libro(String titulo, String editorial, String tipo, double precio) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.tipo = tipo;
        this.precio = precio;
    }
    public Libro(String titulo, String editorial, String tipo) {
        this.titulo = titulo;
        this.editorial = editorial;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
