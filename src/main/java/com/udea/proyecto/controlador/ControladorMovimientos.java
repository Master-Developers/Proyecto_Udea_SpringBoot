package com.udea.proyecto.controlador;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.entidades.MovimientoDinero;
import com.udea.proyecto.servicios.ServicioEmpleado;
import com.udea.proyecto.servicios.ServicioMovimientos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/movimientos")
@RestController
public class ControladorMovimientos {
    @Autowired
    private ServicioMovimientos sic;
    @GetMapping
    public List<MovimientoDinero> listar(){
        return sic.listarMovimientos();
    }
    @PostMapping
    public MovimientoDinero insertar (@RequestBody MovimientoDinero mov){return sic.guardarMovimiento(mov); }
    @PutMapping
    public MovimientoDinero actualizar(@RequestBody MovimientoDinero mov){return sic.actualizarMovimientos(mov); }
    @DeleteMapping
    public void delete(@RequestBody MovimientoDinero mov){ sic.borrarMovimientos((int) mov.getId()); }
}
