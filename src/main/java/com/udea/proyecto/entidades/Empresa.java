package com.udea.proyecto.entidades;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "empresa")
public class Empresa {

    private String nombreEmpresa;
    private int nitEmpresa;
    private String telefonoEmpresa;
    private String direccionEmpresa;

    private ArrayList<Empleado> empleados;
    private ArrayList<MovimientoDinero> transacciones;

    public Empresa(String nombreEmpresa, int nitEmpresa, String telefonoEmpresa, String direccionEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
    }

    public Empresa() {
    }
    //


    //getters y setters

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getTelefonoEmpresa() {
        return telefonoEmpresa;
    }

    public void setTelefonoEmpresa(String telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<MovimientoDinero> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<MovimientoDinero> transacciones) {
        this.transacciones = transacciones;
    }
}
