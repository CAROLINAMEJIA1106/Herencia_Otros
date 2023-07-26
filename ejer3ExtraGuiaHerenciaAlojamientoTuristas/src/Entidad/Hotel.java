/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author Carolina
 */
public abstract class Hotel extends Alojamiento{
    protected Integer cantHabitaciones;
    protected Integer cantCamas;
    protected Integer cantPisos;
    protected Double precioHabitacion;

    public Hotel() {
    }

    public Hotel(Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.cantPisos = cantPisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public Integer getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(Integer cantCamas) {
        this.cantCamas = cantCamas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(Double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    @Override
    public String toString() {
        return "Hotel{" + "cantHabitaciones=" + cantHabitaciones + ", cantCamas=" + cantCamas + ", cantPisos=" + cantPisos + ", precioHabitacion=" + precioHabitacion + '}';
    }
    
    public abstract void precioHabitacionCalculo();
    
    public static Comparator<Hotel> compararPrecio = new Comparator<Hotel>(){
        @Override
        public int compare(Hotel t, Hotel t1) {
            return t1.getPrecioHabitacion().compareTo(t.getPrecioHabitacion());
        }
        
        
    };
    
}
