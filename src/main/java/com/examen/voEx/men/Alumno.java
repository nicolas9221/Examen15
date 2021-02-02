package com.examen.voEx.men;

import java.util.List;

public class Alumno extends Persona{
    private int anioIngreso;
    private List<Curso> cursadas;

    public Alumno(String nombre, String apellido, int legajo, int anioIngreso) {
        super(nombre, apellido, legajo);
        this.anioIngreso = anioIngreso;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void addCurso(Curso curso){
        this.cursadas.add(curso);
    }

    public float obtenerPromedioHoras(String modalidada){
        iterator<Curso>itCursos = this.cursadas.iterator();
        float totalHorasDeCursadas = 0;
        int cursosAsistidos = 0;
        while (itCursos.hasNext()){
            Curso curso = itCursos.next();
            if(curso.esDeModalidada(modalidada)){
                totalHorasDeCursadas = totalHorasDeCursadas+curso.getHorasRequeridas();
                cursosAsistidos++;
            }
        }
        return totalHorasDeCursadas/cursosAsistidos;
    }
}
