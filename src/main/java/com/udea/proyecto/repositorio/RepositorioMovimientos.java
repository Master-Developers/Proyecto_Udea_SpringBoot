package com.udea.proyecto.repositorio;

import com.udea.proyecto.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioMovimientos extends JpaRepository<MovimientoDinero,Long> {
}
