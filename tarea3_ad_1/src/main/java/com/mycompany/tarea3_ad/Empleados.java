/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3_ad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author usuario
 */
@Entity
@Table(name = "empleados")
public class Empleados {

    @Id
    @Column(name = "cod_emp")
    private String cod_emp;
    @Column(name = "nom_emp")
    private String nom_emp;
    @Column(name = "salario")
    private float salario;
    @Column(name = "cod_jefe")
    private String cod_jefe ;
    @Column(name = "cod_depto")
    private String cod_depto ;

    public Empleados(String cod_emp, String nom_emp,  float salario, String cod_jefe, String cod_depto) {
        this.cod_emp = cod_emp;
        this.nom_emp = nom_emp;
        this.salario = salario;
        this.cod_jefe = cod_jefe;
        this.cod_depto = cod_depto;
    }
    public Empleados(){
        
    }
    public Empleados(String nom_emp, float salario, String cod_jefe, String cod_depto) {
        
        this.nom_emp = nom_emp;
        this.salario = salario;
        this.cod_jefe = cod_jefe;
        this.cod_depto = cod_depto;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }

   

    public String getNom_emp() {
        return nom_emp;
    }

    public void setNom_emp(String nom_emp) {
        this.nom_emp = nom_emp;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getCod_jefe() {
        return cod_jefe;
    }

    public void setCod_jefe(String cod_jefe) {
        this.cod_jefe = cod_jefe;
    }

    public String getCod_depto() {
        return cod_depto;
    }

    public void setCod_depto(String cod_depto) {
        this.cod_depto = cod_depto;
    }

}
