/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class Camping extends ExtraHotelero{
    private Integer cantMaxCarpas;
    private Integer cantBaniosDisp;
    private Boolean restaurante;

    public Camping() {
    }

    public Camping(Integer cantMaxCarpas, Integer cantBaniosDisp, Boolean restaurante, Boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantMetros, nombre, direccion, localidad, gerente);
        this.cantMaxCarpas = cantMaxCarpas;
        this.cantBaniosDisp = cantBaniosDisp;
        this.restaurante = restaurante;
    }

    public Integer getCantMaxCarpas() {
        return cantMaxCarpas;
    }

    public void setCantMaxCarpas(Integer cantMaxCarpas) {
        this.cantMaxCarpas = cantMaxCarpas;
    }

    public Integer getCantBaniosDisp() {
        return cantBaniosDisp;
    }

    public void setCantBaniosDisp(Integer cantBaniosDisp) {
        this.cantBaniosDisp = cantBaniosDisp;
    }

    public Boolean getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping{" + "cantMaxCarpas=" + cantMaxCarpas + ", cantBaniosDisp=" + cantBaniosDisp + ", restaurante=" + restaurante + '}';
    }
    
    
}
