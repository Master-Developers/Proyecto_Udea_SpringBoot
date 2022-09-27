package com.udea.proyecto.repositorio;

import com.udea.proyecto.entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado,Long> { //Tipo de Id empleado es long


}
