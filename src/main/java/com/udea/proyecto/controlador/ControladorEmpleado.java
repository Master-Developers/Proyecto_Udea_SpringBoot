package com.udea.proyecto.controlador;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.servicios.ServicioEmpleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


//@RequestMapping("/empleados") //Peticiones http
//@RestController
@Controller
public class ControladorEmpleado {
    @Autowired
    private ServicioEmpleado sic;

    @GetMapping("empleados")
    //public List<Empleado> listar() {return sic.listarEmpleados();}
    public String listarEmps(Model modelo){
        modelo.addAttribute("empleadoo",sic.listarEmpleados());
        return "tablaEmpleado";
    }
    @GetMapping("empleados/nuevo")
    public String formularioRegistro(Model modelo) {
        modelo.addAttribute("empleadosinsertar", new Empleado());
        return "frmEmpleados";
    }
    @PostMapping("empleados/guardar")
    public String insertar(Empleado emp) {
         sic.guardarEmpleados(emp);
         return "redirect:/empleados";
        }
   /* public Empleado insertar(@RequestBody Empleado emp) {return sic.guardarEmpleados(emp);}

    @PutMapping
    public Empleado actualizar(@RequestBody Empleado emp) { return sic.actualizarEmpleados(emp);}

    @DeleteMapping("{id}")
    public void deleteid(@PathVariable("id") Integer id) {
        sic.borrarEmpleados(id); //Borra con documento no con id. Cambiar llave principal.
    }

    //@GetMapping("id_empleado")
    //public Empleado buscar (@PathVariable("Id_empleado") String id){return sic.buscarEmpleadosId(id)}
    @RequestMapping(value = "{id}",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public Empleado buscarId(@PathVariable Integer id){
        Empleado emp = sic.buscarEmpleadosId(id);
        return emp;
    }
    @PatchMapping("/{id}")
    public Empleado actualizarId(@PathVariable("id")Integer id, @RequestBody Map<Object,Object> objectmap){
        return sic.actualizarPorId(Long.valueOf(id),objectmap);
    }*/

}
