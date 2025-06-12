/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

import java.util.Scanner;

/**
 *
 * @author Aisha
 */
public class Rec_1C12420250612PereyraSoleAisha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    SistElectronico sistema = new SistElectronico();
    Scanner input = new Scanner(System.in);
    
    //viajecin = new Viaje(persona,pasajin,tipoViajero,transportin,tipoTransporte);    
      
        int opcion = 0;
        while(opcion != 6) {
            System.out.println("= MENÚ DE GESTIÓN DE VIAJES =");
            System.out.println("1. Registrar nuevo viaje. ");            
            System.out.println("2. Mostrar todos los viajes. ");
            System.out.println("3. Ordenar viajes por costo");
            System.out.println("4. Ordenar viajes por nombre de pasajero");
            System.out.println("5. Mostrar total recaudado");
            System.out.println("6. Salir");
            opcion = input.nextInt();
            
            switch (opcion) {
                case 1:
                    Viaje viajecito =  sistema.ingresoDatos();
                    sistema.agregarViaje(viajecito);
                    break;
                case 2:
                    System.out.println("\nLease->");
                    System.out.println("Tipo de pasajero: 1-Comun, 2-Estudiante, 3-Jubilado");
                    System.out.println("Tipo de transporte:1-Tren, 2-Colectivo, 3-Subte\n");
                    sistema.mostrarViajes();
                    break;
                case 3:
                    
                    System.out.println("Sin resolver :)");
                case 4:
                    System.out.println("Sin resolver :)");
                case 5:
                    System.out.println("Sin resolver :)");
                    break;
                case 6:
                    System.out.println("Adios :)");
                    break;
                default:
                    System.out.println("Opción incorrecta. ");
                    break;
            }
        }
        input.close();
    
    
    
    
    
    
    
    
    
    
    }
}
