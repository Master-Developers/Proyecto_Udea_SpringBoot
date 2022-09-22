package com.udea.proyecto;

import com.udea.proyecto.entidades.Empresa;
import com.udea.proyecto.entidades.MovimientoDinero;
import com.udea.proyecto.repositorio.RepositorioEmpleado;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MovimientoDineroTest {



        @Autowired
        private RepositorioEmpleado repositorio;

        private MovimientoDinero generarMovientoDinero() {
            MovimientoDinero pais = new MovimientoDinero();
            MovimientoDinero.setNombreMovimientoDinero("Colombina");
            MovimientoDinero.setCodigoalfa2("CO");
            MovimientoDinero.setCodigoalfa2("COA");
            return MovimientoDinero;
        }

        @Test
        public void testFindbyId() {
            MovimientoDinero pais = generarMovimientoDinero();
            MovimientoDinero = repositorio.save(dinero);

            MovimientoDinero resultado = repositorio.findById(pais.getId()).get();

            assertEquals(pais.getId(), resultado.getId());
            repositorio.deleteById(pais.getId());
        }

    }
