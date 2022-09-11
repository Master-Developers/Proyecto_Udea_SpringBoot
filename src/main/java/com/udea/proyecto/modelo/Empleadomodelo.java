package com.udea.proyecto.modelo;


import javax.persistence.*;

import com.udea.proyecto.entidades.Empleado;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Empleado")
public class Empleadomodelo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_empleado")
    @GenericGenerator(name = "secuencia_empleado", strategy="increment")
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "idempleado", referencedColumnName = "id")
    private Empleado empleado;

    @Column(name = "nombre", nullable = true, length = 100)
    private String nombre;

    public Empleadomodelo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Empleadomodelo(long id, Empleado empleado, String nombre) {
        this.id = id;
        this.empleado = empleado;
        this.nombre = nombre;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}