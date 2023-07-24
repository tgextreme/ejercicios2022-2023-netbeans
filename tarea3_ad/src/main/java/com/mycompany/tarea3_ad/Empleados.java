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
    @Column(name = "emp_no")
    private int emp_no;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "oficio")
    private String oficio;
    @Column(name = "dir")
    private int dir;
    @Column(name = "salario")
    private float salario;
    @Column(name = "comision")
    private float comision;
    @Column(name = "dept_no")
    private int dept_no;
public Empleados(){
    
}

    @Override
    public String toString() {
        return "Empleados{" + "emp_no=" + emp_no + ", apellido=" + apellido + ", oficio=" + oficio + ", dir=" + dir + ", salario=" + salario + ", comision=" + comision + ", dept_no=" + dept_no + '}';
    }

    public Empleados(int emp_no, float salario, int dept_no) {
        this.emp_no = emp_no;
        this.salario = salario;
        this.dept_no = dept_no;
    }

    public Empleados(int emp_no, String apellido, String oficio, int dir, float salario, float comision, int dept_no) {
        this.emp_no=emp_no;
        this.apellido = apellido;
        this.oficio = oficio;
        this.dir = dir;
        this.salario = salario;
        this.comision = comision;
        this.dept_no = dept_no;
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public int getDir() {
        return dir;
    }

    public void setDir(int dir) {
        this.dir = dir;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dpto_no) {
        this.dept_no = dpto_no;
    }

}
