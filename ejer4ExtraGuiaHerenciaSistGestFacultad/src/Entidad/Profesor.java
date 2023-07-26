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
public class Profesor extends Empleado{
    private String depto;

    public Profesor() {
    }

    public Profesor(String depto, Integer anioIngreso, Integer despachoAsignado, String nombre, String apellido, Integer numIdent, String estadoCivil) {
        super(anioIngreso, despachoAsignado, nombre, apellido, numIdent, estadoCivil);
        this.depto = depto;
    }

    public String getDepto() {
        return depto;
    }

    public void setDepto(String depto) {
        this.depto = depto;
    }

    @Override
    public String toString() {
        return "Profesor{" + "depto=" + depto + '}';
    }

    public void cambioDepto(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el nuevo Departamento del docente: ");
        this.depto = read.next();
        System.out.println("Actualizado");
    }
    
    
}
