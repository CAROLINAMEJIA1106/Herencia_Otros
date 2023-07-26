/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Carolina
 */
public class ExtraHotelero extends Alojamiento{
    protected Boolean privado;
    protected Integer cantMetros;

    public ExtraHotelero() {
    }

    public ExtraHotelero(Boolean privado, Integer cantMetros, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantMetros = cantMetros;
    }

    public Boolean getPrivado() {
        return privado;
    }

    public void setPrivado(Boolean privado) {
        this.privado = privado;
    }

    public Integer getCantMetros() {
        return cantMetros;
    }

    public void setCantMetros(Integer cantMetros) {
        this.cantMetros = cantMetros;
    }

    @Override
    public String toString() {
        return "ExtraHotelero{" + "privado=" + privado + ", cantMetros=" + cantMetros + '}';
    }
    
    
}
