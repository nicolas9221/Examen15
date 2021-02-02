package com.examen.voEx.men;

import java.util.List;

public class Curso {
    private String nombre;
    private int horasRequeridas;
    private List<Alumno> alumnos;
    private List <Float> notas;
    private String modalidad;

    public Curso(String nombre, int horasRequeridas, String modalidad) {
        this.nombre = nombre;
        this.horasRequeridas = horasRequeridas;
        this.modalidad = modalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHorasRequeridas() {
        return horasRequeridas;
    }

    public void addAlumno( Alumno alumno ){
        this.alumnos.add(alumno);
    }
}
