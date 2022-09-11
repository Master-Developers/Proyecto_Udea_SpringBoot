package com.udea.proyecto.modelo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "empresa")
public class Empresamodelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_empresa")
    @GenericGenerator(name = "secuencia_empresa", strategy="increment")
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "id")
    private Empresamodelo empresa;

    @Column(name = "nombre", nullable = true, length = 100)
    private String nombre;

    public Empresamodelo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Empresamodelo(long id, Empresamodelo empresa, String nombre) {
        this.id = id;
        this.empresa = empresa;
        this.nombre = nombre;
    }

    public Empresamodelo getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresamodelo empresa) {
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}