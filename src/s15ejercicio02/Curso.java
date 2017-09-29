/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author alumno
 */
public class Curso {
    
    // Data Fields 
    private String nombreCurso; 
    private ArrayList<String> estudiantes;
    
    // Constructor 
    public Curso(String nombreCurso) {
       this.nombreCurso = nombreCurso;
       estudiantes = new ArrayList<String>();       
    }
    
    // Metodos 
    public void agregarEstudiante(String estudiante) {
        estudiantes.add(estudiante);
    }
    
    public void eliminarEstudiante(String estudiante) {
        estudiantes.remove(estudiante);
    }
    
    public String[] obtenerEstudiantes() {
        String[] a = new String[estudiantes.size()];
        return estudiantes.toArray(a);
    }
    
    public int obtenerNumEstudiantes() {
        return estudiantes.size();
    }
    
    public String obtenerNombreCurso() {
        return this.nombreCurso;
    }
    
}
