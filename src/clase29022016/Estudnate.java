package clase29022016;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Estudnate {
    
    private String nombre;
    private String apellido;
    private String codigo;
    private Curso[] cursos;
    private double nota;
    
    public Estudnate(String nombre, String apellido, String codigo) {
        this.cursos = new Curso[5];
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public double getNota() {
        return nota;
    }
    
    public void setNota(){
        this.nota = nota;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public double calcularPromedio(){
        double promedio = 0;
        
        for (Curso curso: this.cursos){
            promedio += curso.getNota(); 
        }
        promedio = promedio/this.cursos.length;
        return promedio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Curso[] getCursos() {
        return cursos;
    }

    public void setCursos(Curso[] cursos) {
        this.cursos = cursos;
    }
    
    
    
}
