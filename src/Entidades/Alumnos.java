/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.*;

/**
 *
 * @author bebo_
 */
public class Alumnos {
    private int legajo;
    private String apellido;
    private String nombre;
    Set<Materia> materias = new HashSet<>();

    public Alumnos(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.legajo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumnos other = (Alumnos) obj;
        if (this.legajo != other.legajo) {
            return false;
        }
        return true;
    }
    
    
    public void agregarMateria(Materia m){
        materias.add(m);
        
    }
    public int cantidadMaterias(){
        return materias.size();
    }
    public boolean buscarMateria(Materia materia){
        return materias.contains(materia);
    }

    @Override
    public String toString() {
        return nombre+" "+ apellido;
    }
    
}
