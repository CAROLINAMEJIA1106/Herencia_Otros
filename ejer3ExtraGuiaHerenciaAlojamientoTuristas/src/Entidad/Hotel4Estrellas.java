/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Hotel4Estrellas extends Hotel{
    protected String gimnasio;
    protected String nombreRest;
    protected Integer capacidadRest;

    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(String gimnasio, String nombreRest, Integer capacidadRest, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRest = nombreRest;
        this.capacidadRest = capacidadRest;
    }


    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public Integer getCapacidadRest() {
        return capacidadRest;
    }

    public void setCapacidadRest(Integer capacidadRest) {
        this.capacidadRest = capacidadRest;
    }

    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", nombreRest=" + nombreRest + ", capacidadRest=" + capacidadRest + '}';
    }

    @Override
    public void precioHabitacionCalculo() {
        //La capacidad del hotel la doy segun el número de camas que tenga el hotel
        super.precioHabitacion = 50.0 +(1*super.cantCamas);
        
        //agrego por restaurante
        if(this.capacidadRest<30){
            super.precioHabitacion = super.precioHabitacion + 10.0;
        }else{
            if(this.capacidadRest>=30 && this.capacidadRest<=50){
                super.precioHabitacion = super.precioHabitacion + 30.0;
            }else{
                if(this.capacidadRest>50){
                    super.precioHabitacion = super.precioHabitacion + 50.0;
                }
            }
        }
        
        //agrego por gimnasio
        if(this.gimnasio.equalsIgnoreCase("A")){
            super.precioHabitacion = super.precioHabitacion + 50;
        }else{
            if(this.gimnasio.equalsIgnoreCase("B")){
                super.precioHabitacion = super.precioHabitacion + 30;
            }
        }
        
    }
    
    public void mostrarPrecioHab4E(){
        System.out.println("EL precio de la habitación del Hotel 4 Estrellas es de: " + super.precioHabitacion);
    }

    
    
    
}
