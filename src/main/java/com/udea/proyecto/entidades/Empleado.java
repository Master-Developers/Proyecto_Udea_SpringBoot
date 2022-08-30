package com.udea.proyecto.entidades;

public class Empleado {
    // Atributos
    private int documento;
    private String nombre;
    private String celular;
    private String correo;
    private Empresa empresa;
    private RolEmpleado rol; // Administratico operativo

    public Empleado(int documento, String nombre, String celular, String correo, Empresa empresa, RolEmpleado rol) {
        this.documento = documento;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
    }

    public Empleado() {
    }
    //--


    //getters y setters
    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public RolEmpleado getRol() {
        return rol;
    }

    public void setRol(RolEmpleado rol) {
        this.rol = rol;
    }
}
