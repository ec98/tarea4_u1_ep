package com.uce.edu.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tarea4U1EpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Tarea4U1EpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Realizando tarea desde STS");
	}

}
