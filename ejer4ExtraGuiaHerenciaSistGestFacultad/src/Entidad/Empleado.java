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
public class Empleado extends Persona{
    private Integer anioIngreso;
    private Integer despachoAsignado;

    public Empleado() {
    }

    public Empleado(Integer anioIngreso, Integer despachoAsignado, String nombre, String apellido, Integer numIdent, String estadoCivil) {
        super(nombre, apellido, numIdent, estadoCivil);
        this.anioIngreso = anioIngreso;
        this.despachoAsignado = despachoAsignado;
    }

    public Integer getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public Integer getDespachoAsignado() {
        return despachoAsignado;
    }

    public void setDespachoAsignado(Integer despachoAsignado) {
        this.despachoAsignado = despachoAsignado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "anioIngreso=" + anioIngreso + ", despachoAsignado=" + despachoAsignado + '}';
    }

    public void reasignacionDespacho(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el nuevo número de Despacho: ");
        this.despachoAsignado = read.nextInt();
        System.out.println("Actualizado");
    }
    
}
