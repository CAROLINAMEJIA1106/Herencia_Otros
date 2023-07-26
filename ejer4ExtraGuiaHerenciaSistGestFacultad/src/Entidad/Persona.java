/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;


import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer numIdent;
    protected String estadoCivil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer numIdent, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numIdent = numIdent;
        this.estadoCivil = estadoCivil;
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

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumIdent() {
        return numIdent;
    }

    public void setNumIdent(Integer numIdent) {
        this.numIdent = numIdent;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", numIdent=" + numIdent + ", estadoCivil=" + estadoCivil + '}';
    }
    
    public void cambioEC(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Por favor ingrese el nuevo Estado civil: ");
        this.estadoCivil = read.next();
        System.out.println("Actualizado");
    }
    
    public static Comparator<Persona> ordenarlistado = new Comparator<Persona>(){
        @Override
        public int compare(Persona t, Persona t1) {
            return t.getApellido().compareTo(t1.getApellido());
        }
        
    };
}
