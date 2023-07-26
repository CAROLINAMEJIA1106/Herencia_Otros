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
public class PersonalServicio extends Empleado{
    private String seccionAsig;

    public PersonalServicio() {
    }

    public PersonalServicio(String seccionAsig, Integer anioIngreso, Integer despachoAsignado, String nombre, String apellido, Integer numIdent, String estadoCivil) {
        super(anioIngreso, despachoAsignado, nombre, apellido, numIdent, estadoCivil);
        this.seccionAsig = seccionAsig;
    }

    public String getSeccionAsig() {
        return seccionAsig;
    }

    public void setSeccionAsig(String seccionAsig) {
        this.seccionAsig = seccionAsig;
    }

    @Override
    public String toString() {
        return "PersonalServicio{" + "seccionAsig=" + seccionAsig + '}';
    }
    
    public void trasladoSeccion(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese la nueva sección del personal de servicio: ");
        this.seccionAsig = read.next();
        System.out.println("Actualizado");
    }
}
