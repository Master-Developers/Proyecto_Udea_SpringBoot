package com.udea.proyecto.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "empresa")
//@JsonIgnoreProperties({"empleados"})
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa")
    private long id;
    @Column(name = "nombre")
    private String nombreEmpresa;
    @Column(name = "nit", unique = true)
    private int nitEmpresa;
    @Column(name = "telefono")
    private String telefonoEmpresa;
    @Column (name="direccion")
    private String direccionEmpresa;
    //@JsonIgnore
    @JsonIgnore
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL)
    private List<Empleado> empleados;

    @JsonIgnore
    @OneToMany(mappedBy = "empresa",cascade = CascadeType.ALL)
    private List<MovimientoDinero> movimientos;

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

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                ", nitEmpresa=" + nitEmpresa +
                ", telefonoEmpresa='" + telefonoEmpresa + '\'' +
                ", direccionEmpresa='" + direccionEmpresa + '\'' +
                '}';
    }
}
