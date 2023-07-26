/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Hotel5Estrellas extends Hotel4Estrellas{
    private Integer cantSalonesConf;
    private Integer cantSuites;
    private Integer cantLimosinas;

    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantSalonesConf, Integer cantSuites, Integer cantLimosinas, String gimnasio, String nombreRest, Integer capacidadRest, Integer cantHabitaciones, Integer cantCamas, Integer cantPisos, Double precioHabitacion, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRest, capacidadRest, cantHabitaciones, cantCamas, cantPisos, precioHabitacion, nombre, direccion, localidad, gerente);
        this.cantSalonesConf = cantSalonesConf;
        this.cantSuites = cantSuites;
        this.cantLimosinas = cantLimosinas;
    }

    public Integer getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(Integer cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimosinas() {
        return cantLimosinas;
    }

    public void setCantLimosinas(Integer cantLimosinas) {
        this.cantLimosinas = cantLimosinas;
    }

    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "cantSalonesConf=" + cantSalonesConf + ", cantSuites=" + cantSuites + ", cantLimosinas=" + cantLimosinas + '}';
    }

    public void calcularPrecioHabit5E(){
        Hotel4Estrellas h4 = new Hotel4Estrellas();
        h4.precioHabitacionCalculo();
        
        //evaluo limosinas
        super.precioHabitacion = super.precioHabitacion + (15*this.cantLimosinas);
    }

    public void mostrarPrecioHab5E(){
        System.out.println("EL precio de la habitación del Hotel 5 Estrellas es de: " + super.precioHabitacion);
    }
    
    
}
