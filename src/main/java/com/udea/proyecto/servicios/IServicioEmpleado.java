package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.Empleado;

import java.util.List;
import java.util.Map;

public interface IServicioEmpleado {
    //Métodos abstractos
    public List<Empleado>listarEmpleados();
    public Empleado guardarEmpleados(Empleado empleado);
    public Empleado buscarEmpleadosId(Integer numid);
    public Empleado actualizarEmpleados(Empleado empleado);
    public void borrarEmpleados(Integer numid);
    public Empleado actualizarPorId(Long id, Map<Object,Object>objectMap);

}
