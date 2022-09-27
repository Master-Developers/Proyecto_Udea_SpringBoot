package com.udea.proyecto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.udea.proyecto.entidades.Empresa;
import com.udea.proyecto.repositorio.EmpleadoRepositorio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import Empleado.apiEmpresa.modelo.Empresa;
import Empresa.apiempresa.repositorio.RepositorioEmpresa;

    @SpringBootTest
    @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
    public class EmpleadoRepositorioTest {

        @Autowired
        private EmpleadoRepositorio repositorio;

        private Empresa generarEmpresa() {
            Empresa pais = new Empresa();
            Empresa.setNombreEmpresa("Colombina");
            Empresa.setCodigoalfa2("CO");
            Empresa.setCodigoalfa2("COA");
            return empresa;
        }

        @Test
        public void testFindbyId() {
            Empresa pais = generarEmpresa();
            Empresa = repositorio.save(pais);

            Empresa resultado = repositorio.findById(pais.getId()).get();

            assertEquals(pais.getId(), resultado.getId());
            repositorio.deleteById(pais.getId());
        }

    }


}
