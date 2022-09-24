package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.repositorio.RepositorioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ServicioEmpleado implements IServicioEmpleado {

    @Autowired
    private RepositorioEmpleado repositorioEmpleado;
    @Override
    public List<Empleado> listarEmpleados() {
        return repositorioEmpleado.findAll();
    }

    @Override
    public Empleado guardarEmpleados(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public Empleado buscarEmpleadosId(Integer numid) {
        return repositorioEmpleado.findById(numid.longValue()).get();
    }

    @Override
    public Empleado actualizarEmpleados(Empleado empleado) {
        return repositorioEmpleado.save(empleado);
    }

    @Override
    public void borrarEmpleados(Integer numid) {
        repositorioEmpleado.deleteById(numid.longValue());

    }
    @Override
    public Empleado actualizarPorId(Long id, Map<Object, Object> objectMap) {
        return null;
    }
}
