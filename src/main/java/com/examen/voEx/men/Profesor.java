package com.examen.voEx.men;

import java.util.ArrayList;
import java.util.List;

public class Profesor extends Persona{
    private int horasRestantes;
    private List<Float> salario;
    private List<Curso> cursosAsignados;


    public Profesor(String nombre, String apellido, int legajo, int horasRestantes) {
        super(nombre, apellido, legajo);
        this.horasRestantes = horasRestantes;
        this.cursosAsignados = new ArrayList<>();
        this.salario = new ArrayList<>();
    }

    public int getCantidadHoras() {
        return horasRestantes;
    }

    public List<Float> getSalario() {
        return salario;
    }
    public boolean addCurso(Curso nuevoCurso){
        int horasCurso = nuevoCurso.getHorasRequeridas();
        if(this.horasRestantes - horasCurso >= 0){
            this.horasRestantes = this.horasRestantes - horasCurso;
            this.cursosAsignados.add(nuevoCurso);
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return super.toString()+" "+ this.horasRestantes+" "+ this.cursosAsignados.size();
    }
}
