/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase29022016;

/**
 *
 * @author Estudiante
 */
public class Clase29022016 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Curso matriculado[] = new Curso[5];
        for (int i = 0; i < matriculado.length; i++){
        matriculado[i] = new Curso(1, "POO", 4, 0 );
        matriculado[i].setNota(4);
        }
        
        Estudnate estudiante = new Estudnate("G","A","123");
        estudiante.setCursos(matriculado);
        double promedio = estudiante.calcularPromedio();
        
        System.out.println("Promedio: " + promedio);
    }
    
    
    
}//proxyapp.unal.edu.co puerto:8080
