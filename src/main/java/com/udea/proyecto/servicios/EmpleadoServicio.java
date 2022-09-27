package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.Empleado;

import java.util.List;

public interface ServicioEmpleado {
    //Métodos abstractos
    public List<Empleado>listarEmpleados();
    public Empleado guardarEmpleados(Empleado empleado);
    public Empleado buscarEmpleadosId(Integer numid);
    public Empleado actualizarEmpleados(Empleado empleado);
    public void borrarEmpleados(Integer numid);
}
