/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tomasgonzalezad06_1;

/**
 *
 * @author usuario
 */
public class Modulo {
    private String siglasciclo;
    private String  siglasModulo;
    private String nombreModulo;
    private String horasSemanales;

    public Modulo(String siglasciclo, String siglasModulo, String nombreModulo, String horasSemanales) {
        this.siglasciclo = siglasciclo;
        this.siglasModulo = siglasModulo;
        this.nombreModulo = nombreModulo;
        this.horasSemanales = horasSemanales;
    }

    public String getSiglasciclo() {
        return siglasciclo;
    }

    public void setSiglasciclo(String siglasciclo) {
        this.siglasciclo = siglasciclo;
    }

    public String getSiglasModulo() {
        return siglasModulo;
    }

    public void setSiglasModulo(String siglasModulo) {
        this.siglasModulo = siglasModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public String getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(String horasSemanales) {
        this.horasSemanales = horasSemanales;
    }
    
    
}
