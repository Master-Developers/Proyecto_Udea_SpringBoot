package com.udea.proyecto.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import Empresa.ApiEmpresa.modelo.*;
import Empresa.ApiEmpresa.servicio.*;

@RestController
@RequestMapping("/ciudades")
public class EmpleadoControlador {

    @Autowired
    private EmpleadoServicio servicio;

    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public List<Empleado> listar() {
        return servicio.listar();
    }

    @RequestMapping(value = "/obtener/{id}", method = RequestMethod.GET)
    public Empleado obtener(@PathVariable long id) {
        return servicio.obtener(id);
    }

    @RequestMapping(value = "/buscar/{nombre}", method = RequestMethod.GET)
    public List<Empleado> buscar(@PathVariable String nombre) {
        return servicio.buscar(nombre);
    }

    @RequestMapping(value = "/{nombre}/buscarclientes", method = RequestMethod.GET)
    public List<Tercero> buscarEmpleado(@PathVariable String nombre) {
        return servicio.buscarEmpleado(nombre);
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public Empleado crear(@RequestBody Empleado Empleado) {
        return servicio.guardar(Empleado);
    }

    @RequestMapping(value = "/modificar", method = RequestMethod.PUT)
    public Empleado actualizar(@RequestBody Empleado Empleado) {
        return servicio.guardar(Empleado);
    }

    @RequestMapping(value = "/eliminar/{id}", method = RequestMethod.DELETE)
    public boolean eliminar(@PathVariable long id) {
        return servicio.eliminar(id);
    }
}
