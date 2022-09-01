package com.udea.proyecto.entidades;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empleado")
    private long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "documento",unique = true)
    private int documento;
    @Column(name = "celular")
    private String celular;
    @Column(name = "correo",unique = true)
    private String correo;
    @Column(name = "rol")
    private RolEmpleado rol; // Administratico operativo
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Empresa.class)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL)
    private List<MovimientoDinero>transacciones;

    public Empleado(String nombre,int documento,String celular, String correo, Empresa empresa, RolEmpleado rol) {
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
