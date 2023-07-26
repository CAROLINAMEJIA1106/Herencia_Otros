/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Residencias extends ExtraHotelero{
    private Integer cantHabit;
    private Boolean descuentoGremios;
    private Boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(Integer cantHabit, Boolean descuentoGremios, Boolean campoDeportivo, Boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantHabit = cantHabit;
        this.descuentoGremios = descuentoGremios;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabit() {
        return cantHabit;
    }

    public void setCantHabit(Integer cantHabit) {
        this.cantHabit = cantHabit;
    }

    public Boolean getDescuentoGremios() {
        return descuentoGremios;
    }

    public void setDescuentoGremios(Boolean descuentoGremios) {
        this.descuentoGremios = descuentoGremios;
    }

    public Boolean getCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(Boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return "Residencias{" + "cantHabit=" + cantHabit + ", descuentoGremios=" + descuentoGremios + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
}
