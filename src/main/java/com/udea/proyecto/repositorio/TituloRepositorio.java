package com.udea.proyecto.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tiendavideo.apitiendavideo.modelo.*;

@Repository
public interface TituloRepositorio extends JpaRepository<Titulo, Long> {

}