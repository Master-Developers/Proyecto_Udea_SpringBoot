package com.udea.proyecto.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empleados")
//@JsonIgnoreProperties({"empresa"})
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
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Empresa.class)
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @JsonIgnore
    @OneToMany(mappedBy = "empleado",cascade = CascadeType.ALL)
    private List<MovimientoDinero>movimientos;

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

    public List<MovimientoDinero> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<MovimientoDinero> movimientos) {
        this.movimientos = movimientos;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", documento=" + documento +
                ", celular='" + celular + '\'' +
                ", correo='" + correo + '\'' +
                ", rol=" + rol +
                '}';
    }
}
