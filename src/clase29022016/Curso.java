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
public class Curso {
 
    private int codigo;
    private String nombre;
    private int creditos;
    private double nota;

    public Curso(int codigo, String nombre, int creditos, double nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.nota = nota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
}
