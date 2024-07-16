package com.primerCRUD.firstcrud;

import com.primerCRUD.firstcrud.Entity.Estudiante;
import com.primerCRUD.firstcrud.Repository.IEstudianteRepository;
import com.primerCRUD.firstcrud.Service.EstudianteServicio;
import com.primerCRUD.firstcrud.Service.IEstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@SpringBootApplication
public class FirstcrudApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstcrudApplication.class, args);
	}

	@Autowired
	private IEstudianteRepository repositorio;


	@Override
	public void run(String... args) throws Exception {

	}
}



