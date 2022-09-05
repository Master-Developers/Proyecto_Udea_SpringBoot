package com.udea.proyecto;

import com.udea.proyecto.entidades.Empleado;
import com.udea.proyecto.entidades.Empresa;
import com.udea.proyecto.entidades.MovimientoDinero;
import com.udea.proyecto.entidades.RolEmpleado;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication {


	public static void main(String[] args) {

		SpringApplication.run(ProyectoApplication.class, args);

		Empresa empresa1 =new Empresa("3nterprise",1234,"3123143143","cll 14 #13-13");
		Empresa empresa2=new Empresa("4TLAS",4321,"3213414","cll45 #13-13");

		Empleado empleado1 = new Empleado( "Pedro",989382132, "320873635", "pedro1234@gmail.com", empresa1,RolEmpleado.OPERARIO);
		Empleado empleado2 = new Empleado("Daniela" ,93213213, "32112313", "daniela1234@gmail.com", empresa1, RolEmpleado.ADMINISTRADOR);

		MovimientoDinero transaccion1=new MovimientoDinero(empleado1,1000000);
		MovimientoDinero transaccion2=new MovimientoDinero(empleado2,-500000);

		//Se han agregado las dependencias
	}

}
