/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico;

/**
 *
 * @author usuario
 */
public class Documentacion {

    private String descripcion;
    private String rutaDeDiscoduro;

    public Documentacion(String descripcion, String rutaDeDiscoduro) {
        this.descripcion = descripcion;
        this.rutaDeDiscoduro = rutaDeDiscoduro;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutaDeDiscoduro() {
        return rutaDeDiscoduro;
    }

    public void setRutaDeDiscoduro(String rutaDeDiscoduro) {
        this.rutaDeDiscoduro = rutaDeDiscoduro;
    }
    
}
