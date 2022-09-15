package com.udea.proyecto.entidades;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transacciones")
public class MovimientoDinero {
    // Atributos-----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaccion")
    private long id;
    @Column(name = "monto")
    private double monto;
    @Column(name = "fecha")
    private LocalDateTime fecha;
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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
}

