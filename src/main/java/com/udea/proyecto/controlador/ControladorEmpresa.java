package com.udea.proyecto.controlador;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.entidades.Empresa;
import com.udea.proyecto.servicios.ServicioEmpleado;
import com.udea.proyecto.servicios.ServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/empresas")
@RestController
public class ControladorEmpresa {
    @Autowired
    private ServicioEmpresa sic;
    @GetMapping
    public List<Empresa> listar(){
        return sic.listarEmpresas();
    }

    @PostMapping
    public Empresa insertar (@RequestBody Empresa emp){return sic.guardarEmpresa(emp); }
    @PutMapping
    public Empresa actualizar(@RequestBody Empresa emp){

        return sic.actualizarEmpresa(emp);
    }
    @DeleteMapping
    public void delete(@RequestBody Empresa emp){
        sic.borrarEmpresa(emp.getNitEmpresa()); //Se borra con nit no con id.

    }
}
