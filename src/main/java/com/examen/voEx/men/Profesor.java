package com.examen.voEx.men;

import java.util.List;

public class Profesor extends Persona{
    private int horasRestantes;
    private List<Float> salario;
    private List<Curso> cursosAsignados;


    public Profesor(String nombre, String apellido, int legajo, int horasRestantes) {
        super(nombre, apellido, legajo);
        this.horasRestantes = horasRestantes;
    }

    public int getCantidadHoras() {
        return horasRestantes;
    }

    public List<Float> getSalario() {
        return salario;
    }
    public void addCurso(Curso curso){
        this.cursosAsignados.add(curso);
    }
}
