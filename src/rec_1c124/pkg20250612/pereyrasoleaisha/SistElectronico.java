/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Aisha
 */
public class SistElectronico {
        public ArrayList <Viaje> viajes = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        
        int precio = 100;
        double recaudado = 0;
        public /*protected*/ Viaje ingresoDatos() {
        
        VehiculoTransporte transportin;
        Viaje viajecin;
        Usuario persona;
        PasajeComun pasajin;
        //Usuario
        System.out.println("Nombre pasajero: ");
        String nombre = input.next();
        
        System.out.println("Tipo de pasajero:\n 1-Comun\n 2-Estudiante\n 3-Jubilado: ");
        int tipoViajero = input.nextInt();
            if (tipoViajero<1 || tipoViajero>3){
                System.out.println("El número ingresado no corresponde al tipo de pasajero. Carga cancelada");
                viajecin =null;
                return viajecin;
            }
        //PasajeComun
        switch(tipoViajero) {
            case 1:
                pasajin = new PasajeComun(precio);
                recaudado += pasajin.pasaje(precio);
                  break;
            case 2:
                pasajin = new PasajeEstudiante(precio);
                recaudado += pasajin.pasaje(precio);
                break;

            case 3:
                pasajin = new PasajeJubilado(precio);
                recaudado += pasajin.pasaje(precio);
                break;

            default:
                System.out.println("Opción inválida. Carga cancelada");
                viajecin=null;
                return viajecin;
                
        }
        //VehiculoTransporte
        System.out.println("Transporte:\n 1-Tren\n 2-Colectivo\n 3-Subte: ");
        int tipoTransporte = input.nextInt();
            if (tipoTransporte<1 || tipoTransporte>3){
                System.out.println("El número ingresado no corresponde al tipo de transporte. Carga cancelada");
                viajecin =null;
                return viajecin;
            }else{
                System.out.println("Patente del vehiculo: ");
                String patente = input.next();
                System.out.println("Capacidad del vehiculo: ");
                int capacidad = input.nextInt();
                System.out.println("Empresa del vehiculo: ");
                String empresa = input.next();
        
            persona= new Usuario(nombre, tipoViajero);
            
        switch(tipoTransporte) {
            case 1:
                transportin = new Tren(patente,capacidad,empresa);
                recaudado -= transportin.calcularCostoBase(precio);
                
                  break;
            case 2:
                transportin = new Colectivo(patente,capacidad,empresa);
                recaudado -= transportin.calcularCostoBase(precio);
                break;

            case 3:
                transportin = new Subte(patente,capacidad,empresa);
                recaudado -= transportin.calcularCostoBase(precio);
                break;

            default:
                System.out.println("Opción inválida. Carga cancelada");
                viajecin=null;
                return viajecin;
                }
        }
        viajecin = new Viaje(persona,pasajin,tipoViajero,transportin,tipoTransporte);
        System.out.println("Registrado");
        
        return viajecin;
    }
        
        public void agregarViaje(Viaje viajecin){
            viajes.add(viajecin);
        }
            
     public void mostrarViajes(){
        for(Viaje viajecin: viajes) {
            System.out.println(viajecin);
        }
    }
}
