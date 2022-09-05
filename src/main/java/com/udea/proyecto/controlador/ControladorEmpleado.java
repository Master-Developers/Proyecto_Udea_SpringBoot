package com.udea.proyecto.controlador;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.servicios.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/empleado")
@RestController
public class ControladorEmpleado {
    @Autowired
    private ServicioEmpleado sic;
    @GetMapping
    public List<Empleado> listar(){
        return sic.listarEmpleados()
    }
    @PostMapping
    public Empleado insertar (@RequestBody Empleado emp){
            return sic.guardarEmpleados(emp);
        }
    @PutMapping
    public Empleado actualizar(@RequestBody Empleado emp){
            return sic.actualizarEmpleados(emp);
        }
}
