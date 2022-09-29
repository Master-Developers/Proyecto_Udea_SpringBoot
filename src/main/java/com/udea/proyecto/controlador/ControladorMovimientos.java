package com.udea.proyecto.controlador;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.entidades.MovimientoDinero;
import com.udea.proyecto.servicios.ServicioEmpleado;
import com.udea.proyecto.servicios.ServicioMovimientos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/movimientos")
//@RestController
@Controller
public class ControladorMovimientos {
    @Autowired
    private ServicioMovimientos sic;
    @GetMapping("movimientos")
    //public List<MovimientoDinero> listar(){return sic.listarMovimientos();}
    public String listarMovs(Model modelo) {
        modelo.addAttribute("movss", sic.listarMovimientos());
        return "tablaMovimientos";
    }
    @GetMapping("movimientos/nuevo")
    public String formularioRegistro(Model modelo) {
        modelo.addAttribute("movimientosinsertar", new MovimientoDinero());
        return "frmMovimientos";
    }
    @PostMapping("movimientos/guardar")
    public String insertar (MovimientoDinero mov){
         sic.guardarMovimiento(mov);
         return "redirect:/movimientos";
    }
    /*public MovimientoDinero insertar (@RequestBody MovimientoDinero mov){
        return sic.guardarMovimiento(mov); }
    @PutMapping
    public MovimientoDinero actualizar(@RequestBody MovimientoDinero mov){return sic.actualizarMovimientos(mov); }
    @DeleteMapping
    public void delete(@RequestBody MovimientoDinero mov){
        sic.borrarMovimientos((int) mov.getId()); }*/


}
