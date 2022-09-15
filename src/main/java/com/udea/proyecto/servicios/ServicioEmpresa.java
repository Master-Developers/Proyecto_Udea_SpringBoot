package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.Empresa;
import com.udea.proyecto.repositorio.RepositorioEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioEmpresa implements IServicioEmpresa{
    @Autowired
    private RepositorioEmpresa repositorioEmpresa;
    @Override
    public List<Empresa> listarEmpresas() {
        return repositorioEmpresa.findAll();
    }

    @Override
    public Empresa guardarEmpresa(Empresa empresa) {
        return repositorioEmpresa.save(empresa);
    }

    @Override
    public Empresa buscarEmpresaId(Integer numid) {
        return repositorioEmpresa.findById(numid.longValue()).get();
    }

    @Override
    public Empresa actualizarEmpresa(Empresa empresa) {
        return repositorioEmpresa.save(empresa);
    }

    @Override
    public void borrarEmpresa(Integer numid) {
        repositorioEmpresa.deleteById(numid.longValue());
    }
}
