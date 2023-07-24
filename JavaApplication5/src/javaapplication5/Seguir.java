/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author usuario
 */
public class Seguir {

    private Usuario usuario;
    private Canal canal;

    public Seguir(Usuario usuario, Canal canal) {
        this.usuario = usuario;
        this.canal = canal;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Canal getCanal() {
        return canal;
    }
    

}
