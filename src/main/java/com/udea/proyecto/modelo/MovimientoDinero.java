package com.udea.proyecto.modelo;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "MovimientoDinero")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_MovimientoDinero")
    @GenericGenerator(name = "secuencia_MoviemientoDinero", strategy="increment")
    @Column(name = "id")
    private long id;

    @Column(name = "MovimientoDinero", length = 100, unique = true)
    private String MovimientoDinero;

    @Column(name = "codigo1", nullable = true, length = 5)
    private String codigo1;

    @Column(name = "codigo2", nullable = true, length = 5)
    private String codigo2;

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

    public String getCodigo1() {
        return codigo1;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2;
    }

    public String getCodigo3() {
        return codigo3;
    }

    public void setCodigo3(String codigo3) {
        this.codigo3 = codigo3;
    }

}

