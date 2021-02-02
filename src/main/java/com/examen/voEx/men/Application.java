package com.examen.voEx.men;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		Curso curso = new Curso("Corte y Confeccion",20,"Precencial");
		Alumno alumno = new Alumno("Roberto","Gomez Bolanio",289612,2020);
		curso.addAlumno(alumno);


	}





}
