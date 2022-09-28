package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.Empresa;

import java.util.List;

public interface IServicioEmpresa {

    public List<Empresa> listarEmpresas();
    public Empresa guardarEmpresa(Empresa empresa);
    public Empresa buscarEmpresaId(Integer numid);
    public Empresa actualizarEmpresa(Empresa empresa);
    public void borrarEmpresa(Long numid);
}
