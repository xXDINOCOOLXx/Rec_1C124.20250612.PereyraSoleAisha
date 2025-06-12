/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public class Colectivo extends VehiculoTransporte{
    static double costo = 0.002;

    public Colectivo(String patente, int capacidad, String empresa) {
        super(patente, capacidad, empresa);
    }
    
    
    
    @Override
    public double calcularCostoBase(int boleto){
    return boleto*costo;
    }
}