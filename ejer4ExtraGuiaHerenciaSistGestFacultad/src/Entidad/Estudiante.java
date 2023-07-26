/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Estudiante extends Persona{
    private String cursoMatriculado;

    public Estudiante() {
    }

    public Estudiante(String cursoMatriculado, String nombre, String apellido, Integer numIdent, String estadoCivil) {
        super(nombre, apellido, numIdent, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "cursoMatriculado=" + cursoMatriculado + '}';
    }
    
    public void matriculacionNuevoCurso(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el nuevo curso del Estudiante: ");
        this.cursoMatriculado = read.next();
        System.out.println("Actualizado");
    }

   
    
    
}
