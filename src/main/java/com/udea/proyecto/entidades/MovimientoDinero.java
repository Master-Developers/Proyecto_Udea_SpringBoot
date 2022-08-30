package com.udea.proyecto.entidades;

public class MovimientoDinero {
    // Atributos-----------------------------------------------------------------------
    private Empleado empleado;
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

