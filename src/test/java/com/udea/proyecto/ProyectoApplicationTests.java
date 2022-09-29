package com.udea.proyecto;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class ProyectoApplicationTests {

	@ExtendWith(SpringExtension.class)
	@SpringBootTest
	@AutoConfigureMockMvc
	public class BookControllerIT {
		@Autowired
		private MockMvc mockMvc;


	}

}

