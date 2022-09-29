package com.udea.proyecto.controlador;

import com.udea.proyecto.entidades.Empresa;
import com.udea.proyecto.servicios.ServicioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RequestMapping("/empresas")
//@RestController
@Controller
public class ControladorEmpresa {
    @Autowired
    private ServicioEmpresa sic;
   @GetMapping("/empresas")
    //public List<Empresa> listar(){return sic.listarEmpresas();}
    public String listarEmpresas(Model modelo){
        modelo.addAttribute("empresaa",sic.listarEmpresas());
        return "tablaEmpresa";
    }
    @GetMapping("empresas/nuevo")
    public String formularioRegistro(Model modelo){
       modelo.addAttribute("empresasinsertar", new Empresa());
       return "frmEmpresas";
    }
    @PostMapping("empresas/guardar")
    public String insertar (Empresa emp){
        sic.guardarEmpresa(emp);
        return "redirect:/empresas"; }

    @GetMapping("/")
    public String home(Model model, @AuthenticationPrincipal OidcUser principal) {
        return "index";
    }

    //public Empresa insertar (@RequestBody Empresa emp){return sic.guardarEmpresa(emp); }
  /*  @PutMapping
    public Empresa actualizar(@RequestBody Empresa emp){

        return sic.actualizarEmpresa(emp);
    }
    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Integer id){
        sic.borrarEmpresa(id.longValue()); //Se borra con nit no con id.

    }
    @RequestMapping(value = "{id}",method = RequestMethod.GET,produces = "application/json")
    @ResponseBody
    public Empresa buscarId(@PathVariable Integer id){
        Empresa emp = sic.buscarEmpresaId(id);
        return emp;
    }*/
}
