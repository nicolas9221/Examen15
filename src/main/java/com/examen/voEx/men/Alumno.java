package com.examen.voEx.men;

import java.util.List;

public class Alumno extends Persona{
    private int anioIngreso;
    private List<Curso> cursadas;

    public Alumno(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void addCurso(Curso curso){
        this.cursadas.add(curso);
    }
}
