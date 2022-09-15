package com.udea.proyecto.servicios;

import com.udea.proyecto.entidades.MovimientoDinero;
import com.udea.proyecto.repositorio.RepositorioMovimientos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMovimientos implements IServicioMovimientos {
    @Autowired
        private RepositorioMovimientos repositorioMovimientos;

    @Override
    public List<MovimientoDinero> listarMovimientos() {
        return repositorioMovimientos.findAll();
    }

    @Override
    public MovimientoDinero guardarMovimiento(MovimientoDinero mov) {
        return repositorioMovimientos.save(mov);
    }

    @Override
    public MovimientoDinero buscarMovimientosId(Integer numid) {
        return repositorioMovimientos.findById(numid.longValue()).get();
    }

    @Override
    public MovimientoDinero actualizarMovimientos(MovimientoDinero mov) {
        return repositorioMovimientos.save(mov);
    }

    @Override
    public void borrarMovimientos(Integer numid) {
        repositorioMovimientos.deleteById(numid.longValue());
    }
}
