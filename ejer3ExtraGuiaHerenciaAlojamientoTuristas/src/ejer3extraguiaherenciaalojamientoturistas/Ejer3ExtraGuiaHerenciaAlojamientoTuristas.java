/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer3extraguiaherenciaalojamientoturistas;

import Service.ServiceAlojamiento;

/**
 *
 * @author Carolina
 */
public class Ejer3ExtraGuiaHerenciaAlojamientoTuristas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiceAlojamiento sa = new ServiceAlojamiento();
        sa.crearAlojamientos();
        sa.precioAlojamientos();
        sa.sistemaConsulta();
    }
    
}
