/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ejercicio02;

/**
 *
 * @author alumno
 */
public class S15ejercicio02 {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso curso01 = new Curso("Estructura de Datos");
        Curso curso02 = new Curso("Sistemas de Base de Datos");
        
        curso01.agregarEstudiante("Peter Jones");
        curso01.agregarEstudiante("Kim Smith");
        curso01.agregarEstudiante("Anne Kennedy");        
        curso02.agregarEstudiante("Peter Jones");
        curso02.agregarEstudiante("Steve Smith");
        
        System.out.println("");
        System.out.println("CURSO 01");
        System.out.println("N° Estudiantes: " + curso01.obtenerNumEstudiantes());
        String[] estudiantesC01 = curso01.obtenerEstudiantes();        
        for (int i = 0; i < curso01.obtenerNumEstudiantes(); i++) {
            System.out.println("- " + estudiantesC01[i]);        
        }
        System.out.println("");
        System.out.println("CURSO 02");
        System.out.println("N° Estudiantes: " + curso02.obtenerNumEstudiantes());                       
        String[] estudiantesC02 = curso02.obtenerEstudiantes();        
        for (int i = 0; i < curso02.obtenerNumEstudiantes(); i++) {
            System.out.println("- " + estudiantesC02[i]);
        }        
    }
    
}
