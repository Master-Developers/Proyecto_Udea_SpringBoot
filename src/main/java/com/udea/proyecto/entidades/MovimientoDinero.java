package com.udea.proyecto.entidades;

import javax.persistence.*;

@Entity
@Table(name = "transacciones")
public class MovimientoDinero {
    // Atributos-----------------------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_transaccion")
    private long id;
    @ManyToOne(fetch = FetchType.LAZY,targetEntity = Empleado.class)
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    @Column(name = "monto")
    private double monto;

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
}

