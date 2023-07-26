/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.ExtraHotelero;
import Entidad.Hotel;
import Entidad.Hotel4Estrellas;
import Entidad.Hotel5Estrellas;
import Entidad.Residencias;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carolina
 */
public class ServiceAlojamiento {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    Alojamiento aloja = new Alojamiento();
    ArrayList<Hotel> listHoteles = new ArrayList();
    Hotel hot;
    Hotel4Estrellas h4 = new Hotel4Estrellas();
    Hotel5Estrellas h5 = new Hotel5Estrellas();
    ExtraHotelero exthotel = new ExtraHotelero();
    Camping camp = new Camping();
    Residencias res = new Residencias();
    ArrayList<Alojamiento> listado = new ArrayList();
    
    //creo métodos
    public void crearAlojamientos(){
        listado.add(new Hotel4Estrellas("A", "NUEVO SABOR", 60, 72, 288, 12, 0.0, "HOTEL REAL", "Calle principal real", "Barbosa", "CARLOS JOSÉ QUINTERO"));
        listado.add(new Hotel4Estrellas("B", "DELICIAS DEL PALADAR", 35, 50, 100, 5, 0.0, "HOTEL CAMINO REAL", "Calle 2A nuevo real", "Genuino", "JUAN PABLO MEJIA"));
        listado.add(new Hotel5Estrellas(2, 5, 3, "A", "BUEN SABOR", 50, 80, 240, 12, 0.0, "HOTEL STAR PLUS", "CARRERA 10 CON CALLE 45", "CALI", "JULIA RUIZ"));
        listado.add(new Hotel5Estrellas(1, 2, 1, "B", "EXQUISITO", 25, 25,50 , 6, 0.0, "HOTEL PLUS", "CARRERA 1 CON CALLE 50", "azul", "BLADIMIR"));

        listado.add(new Camping(20, 10, true, true, 100, "TODO SOL", "Avenida Stellar", "BALTAZAR", "JORGE ATERTUA"));
        listado.add(new Camping(10, 4, false, false, 40, "SOL Y LLUVIA", "Avenida Oeste", "JERONIMO", "FERNANDO AGUILAR"));
        listado.add(new Residencias(40, true, true, false, 120, "VILLA ALEGRIA", "CALLE REAL II", "BASTIDAS", "CRISTIAN MARQUEZ"));
        listado.add(new Residencias(20, false, false, true,40, "VILLA SUR", "CALLE REAL III", "BASTIDAS 3", "JORGE VELEZ"));
        
    }
    
    public void precioAlojamientos(){
        for (Alojamiento alojamiento : listado) {
            if(alojamiento instanceof Hotel4Estrellas){
                h4 = (Hotel4Estrellas)alojamiento;
                h4.precioHabitacionCalculo();
            }else{
                if(alojamiento instanceof Hotel5Estrellas){
                    h5 = (Hotel5Estrellas)alojamiento;
                    h5.calcularPrecioHabit5E();
                }
            }
        }
    }
    public void sistemaConsulta(){
        int op;
        do{
            System.out.println("--- Sistema de Consulta de la RED de ALOJAMIENTOS LA GRAN HOTELERIA ---");
            System.out.println("Elija la opción que desee revisar:");
            System.out.println("1. Consultar todos los Alojamientos");
            System.out.println("2. Consultar todos los hoteles del más caro al más barato");
            System.out.println("3. Consultar todos los campings con restaurante");
            System.out.println("4. Consultar las residencias con descuentos");
            System.out.println("5. Exit");
            op = read.nextInt();
            switch (op) {
                
                case 1:
                    System.out.println("LISTADO COMPLETO DE ALOJAMIENTOS: ");
                    for (Alojamiento alojamiento : listado) {
                        System.out.println(" " + alojamiento.getNombre() +" "+alojamiento.getDireccion() +" "+alojamiento.getLocalidad()+" "+alojamiento.toString());
                    }
                    
                    break;
                case 2:
                    
                    System.out.println("Listado de Hoteles del más Costoso al más Económico: ");
                    for (Alojamiento alojamiento : listado) {
                        if(alojamiento instanceof Hotel){
                            listHoteles.add((Hotel) alojamiento);
                        }
                    }
                    listHoteles.sort(Hotel.compararPrecio);
                    for (Hotel listHotele : listHoteles) {
                        System.out.println(" " + listHotele.getNombre() + " "+listHotele.getPrecioHabitacion() +"  " + listHotele.toString());
                    }
                       
                    break;
                case 3:
                    System.out.println("Listado de Camping con Restaurantes: ");
                    for (Alojamiento alojamiento : listado) {
                        if(alojamiento instanceof Camping){
                            camp = (Camping) alojamiento;
                            if(camp.getRestaurante()==true){
                                System.out.println(" " +camp.getNombre()+" "+ camp.toString());
                            }
                        }
                    }
                
                    
                    break;
                case 4:
                    System.out.println("Listado de Residencias con descuento: ");
                    for (Alojamiento alojamiento : listado) {
                        if(alojamiento instanceof Residencias){
                            res = (Residencias) alojamiento;
                            if(res.getDescuentoGremios()==true){
                                System.out.println(" " + res.getNombre()+" " +res.toString());
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Exit ---- THANK YOU");
                    break;
                default:
                    System.out.println("Opción no válida!!!!");
            }
        
        }while(op != 5);
               
    }
    
}
