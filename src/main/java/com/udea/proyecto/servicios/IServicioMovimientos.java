package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.MovimientoDinero;

import java.util.List;

public interface IServicioMovimientos {
    public List<MovimientoDinero> listarMovimientos();
    public MovimientoDinero guardarMovimiento(MovimientoDinero mov);
    public MovimientoDinero buscarMovimientosId(Integer numid);
    public MovimientoDinero actualizarMovimientos(MovimientoDinero mov);
    public void borrarEmpleados(Integer numid);
}
