package com.udea.proyecto.repositorio;

import com.udea.proyecto.entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositorioMovimientos extends JpaRepository<MovimientoDinero,Long> {

    //get
   @Query(value = "SELECT * FROM transacciones where id_empresa=?1",nativeQuery = true)
   public abstract List<MovimientoDinero> findByEmpresa(long id);


}
