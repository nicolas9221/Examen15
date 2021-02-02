package com.examen.voEx.men;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		Curso curso1 = new Curso("Corte y Confeccion",20,"Presencial");
		Curso curso2 = new Curso("Costura",5,"Virtual");
		Curso curso3 = new Curso("Pintura",10,"Presencial");

		Alumno pepe = new Alumno("Roberto","Gomez Bolanio",289612,2020);

		pepe.addCurso(curso1);
		pepe.addCurso(curso2);
		pepe.addCurso(curso3);

		System.out.println(pepe.toString());

		Float promedio = pepe.obtenerPromedioHoras("Presencial");

		System.out.println(promedio);


//		Curso curso1 = new Curso("Programación", 2, "Presencial");
//		Curso curso2 = new Curso("Base de datos", 4, "Virtual");
//		Curso curso3 = new Curso("Tecnicas", 6, "Virtual");
//
//		Profesor profesor1 = new Profesor ("Daenerys", "Targaryen", 123456, 40);
//		Profesor profesor2 = new Profesor ("Jon", "Snow", 123457, 30);
//		Profesor profesor3 = new Profesor ("Cersei", "Lannister", 123458, 20);
//
//		profesor1.addCurso(curso1);
//		profesor2.addCurso (curso2);
//		profesor3.addCurso (curso3);
//
//		System.out.println(profesor1);
//		System.out.println(profesor2);
//		System.out.println(profesor3);


	}





}
