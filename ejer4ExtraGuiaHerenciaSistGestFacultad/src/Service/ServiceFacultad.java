/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entidad.Empleado;
import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.PersonalServicio;
import Entidad.Profesor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;



/**
 *
 * @author Carolina
 */
public class ServiceFacultad {
    Persona per = new Persona();
    Empleado emp = new Empleado();
    Estudiante est = new Estudiante();
    Profesor prof = new Profesor();
    PersonalServicio perser = new PersonalServicio();
    HashSet<Persona> listado = new HashSet();
    ArrayList<Persona> listadoaux = new ArrayList(listado);
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void crearListado(){
        listado.add(new Estudiante("Ingenieria Ambiental", "CAMILA", "VELEZ", 41273988, "casada"));
        listado.add(new Estudiante("Ingenieria Mecatronica","FERNANDO", "PEREZ", 34567908, "soltero"));
        listado.add(new Estudiante("Ingenieria Industrial","SANDRA", "BENAVIDEZ", 32456788, "unión libre"));
        listado.add(new Profesor("Matemática", 2000, 3, "JAVIER", "BASTIDAS", 6135567, "soltero"));
        listado.add(new Profesor("Arquitectura", 1995, 1, "CAROLINA", "ORREGO", 34567456, "soltera"));
        listado.add(new Profesor("Lenguajes", 2005, 2, "CARLOS", "QUINTERO", 31234567, "casado"));
        listado.add(new PersonalServicio("Biblioteca", 2001, 3, "ANDREA", "REYES", 45678345, "casada"));
        listado.add(new PersonalServicio("Decanatura", 1998, 2, "MANUEL", "SANTRICH", 23456654, "soltero"));
        listado.add(new PersonalServicio("Rectoría", 2000, 1, "MARIA FERNANDA", "REINOSA", 45654321, "casada"));
        listado.add(new Profesor("Matemática", 2005, 3, "LUIS JAVIER", "CRUZ", 23432567, "soltero"));
        
        for (Persona persona : listado) {
            listadoaux.add(persona);
        }
        
    }
    
    public void menuPpal(){
        int op;
        int nest;
        System.out.println("Este es el menú de la Facultad de Ingeniería");
        System.out.println("Por favor digite una de las siguientes opciones: ");
        
        do{
            System.out.println("1. Cambio de estado civil de una persona");
            System.out.println("2. Reasignación de despacho de un empleado de la Facultad");
            System.out.println("3. Matriculación a un nuevo curso de un estudiante");
            System.out.println("4. Cambio de Departamento de un Docente de la Facultad");
            System.out.println("5. Traslado de sección de un empleado del área de Personal de Servicio de la Facultad");
            System.out.println("6. Pantallazo de la información completa del personal de la Facultad");
            System.out.println("7. Exit");
            op = read.nextInt();
            /*
            if(alojamiento instanceof Hotel4Estrellas){
                h4 = (Hotel4Estrellas)alojamiento;
                h4.precioHabitacionCalculo();
            */
            
            switch (op) {
                case 1:
                    System.out.println("Por favor ingrese el número de documento de la persona a cambiar el estado civil: ");
                    nest = read.nextInt();
                    
                    for (Persona persona : listado) {
                        if(nest == persona.getNumIdent()){
                            persona.cambioEC();
                            
                        }
                        
                    }
                    nest = 0;
                    break;
                case 2:
                    System.out.println("Por favor ingrese el número de documento del empleado a reasignar el despacho: ");
                    nest = read.nextInt();
                    
                    for (Persona persona : listado) {
                        if(nest == persona.getNumIdent()){
                            if(persona instanceof Empleado){
                            ((Empleado) persona).reasignacionDespacho();
                            }
                            
                        }
                        
                    }
                    nest = 0;
                    break;
                case 3:
                    System.out.println("Por favor ingrese el número de documento del estudiante a matricular nuevo curso: ");
                    nest = read.nextInt();
                    
                    for (Persona persona : listado) {
                        if(nest == persona.getNumIdent()){
                            if(persona instanceof Estudiante){
                            ((Estudiante) persona).matriculacionNuevoCurso();
                            }
                            
                        }
                    }
                    nest = 0;
                    break;
                case 4:
                    System.out.println("Por favor ingrese el número de documento del docente a cambiar el departamento: ");
                    nest = read.nextInt();
                    
                    for (Persona persona : listado) {
                        if(nest == persona.getNumIdent()){
                            if(persona instanceof Profesor){
                            ((Profesor) persona).cambioDepto();
                            }
                            
                        }
                    }
                    nest = 0;
                    break;
                case 5:
                    System.out.println("Por favor ingrese el número de documento del personal de servicio a cambiar de sección: ");
                    nest = read.nextInt();
                    
                    for (Persona persona : listado) {
                        if(nest == persona.getNumIdent()){
                            if(persona instanceof PersonalServicio){
                            ((PersonalServicio) persona).trasladoSeccion();
                            }
                            
                        }
                    }
                    nest = 0;
                    break;
                case 6:
                    System.out.println("Listado de empleados de la FACULTAD DE INGENIERIA");
                    
                    listadoaux.sort(Persona.ordenarlistado);
                    
                    for (Persona persona : listadoaux) {
                        System.out.print(" "+persona.toString()+" nombre completo: "+persona.getApellido()+" "+persona.getNombre()+" /Documento: "+persona.getNumIdent()+" /Estado civil: "+persona.getEstadoCivil());
                        if(persona instanceof Empleado){
                            System.out.print(" /Año de Incorporación: "+((Empleado) persona).getAnioIngreso()+" /# Despacho asignado: "+((Empleado) persona).getDespachoAsignado());
                        }
                        if(persona instanceof Estudiante){
                            System.out.print(" /Curso matriculado: "+((Estudiante) persona).getCursoMatriculado());
                        }
                        if(persona instanceof Profesor){
                            System.out.print(" /Departamento al que pertenece: "+((Profesor) persona).getDepto());
                        }
                        if(persona instanceof PersonalServicio){
                            System.out.print(" /Sección asignada: "+((PersonalServicio) persona).getSeccionAsig());
                        }
                        System.out.println(" ");
                    }
                    
                    break;
                case 7:
                    System.out.println(" Exit --- Thank you -----");
                    break;
                
                default:
                    System.out.println("Opción inválida!!!!");
            }
            
            
        }while(op != 7);
        
    }
}
