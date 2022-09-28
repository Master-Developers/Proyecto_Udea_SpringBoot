package com.udea.proyecto.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "transacciones")
@JsonIgnoreProperties({"empresa","empleado"})
//@JsonIgnoreProperties({"empleado"})
public class MovimientoDinero {
    // Atributos-----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaccion")
    private long id;
    @Column(name = "monto")
    private double monto;
    @Column(name = "fecha")
    private Date fecha;

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Empleado.class)
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Empresa.class)
    @JoinColumn(name = "id_empresa")
    private  Empresa empresa;


    public MovimientoDinero(Empleado empleado, double monto) {
        this.empleado = empleado;
        this.monto = monto;
    }

    public MovimientoDinero() {
    }

/*    // Metodoss------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------
    public double ingresarDinero(Empleado empleado, double monto) {
        // indicar la cantidad de dinero que desea ingresar
        if (monto > 0) {
            return montoInicial += monto;
        } else {
            return Double.parseDouble("El dinero ingresado debe ser mayor a cero ");
        }
    }
    public double retirarDinero(Empleado empleado, double monto) {
        if (monto > 0) {
            return montoInicial -= monto;
        } else {
            return Double.parseDouble("El dinero retirado debe ser mayor a cero ");
        }
    }
* */

    //Getters y setters
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto=" + monto +
                ", fecha=" + fecha +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                '}';
    }
}
