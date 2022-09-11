package com.udea.proyecto.modelo;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_MovimientoDinero")
    @GenericGenerator(name = "secuencia_MoviemientoDinero", strategy="increment")
    @Column(name = "id")
    private long id;

    @Column(name = "descripcion", length = 100, unique = true)
    private String descripcion;

    @Column(name = "done", nullable = true, length = 5)
    private String done;

    @Column(name = "dueData", nullable = true, length = 5)
    private String dueData;
    private String MovimientoDinero;

    public MovimientoDinero() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMovimientoDinero() {
        return MovimientoDinero;
    }

    public void setMovimientoDinero(String MovimientoDinero) {
        this.MovimientoDinero = MovimientoDinero;
    }

    public String getdescripcion() {
        return descripcion;
    }

    public void setdone(String done) {
        this.done = done;
    }

    public String getdueData() {
        return dueData;
    }

    public void setCodigo3(String codigo3) {
        this.done = done;
    }

}

