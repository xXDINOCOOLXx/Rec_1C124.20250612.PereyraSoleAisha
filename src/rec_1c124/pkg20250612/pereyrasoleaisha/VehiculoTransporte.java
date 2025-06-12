/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public abstract class VehiculoTransporte {
    String patente;
    int capacidad;
    String empresa;

    public VehiculoTransporte(String patente, int capacidad, String empresa) {
        this.patente = patente;
        this.capacidad = capacidad;
        this.empresa = empresa;
    }
    
    public abstract double calcularCostoBase(int boleto);
    
     @Override
    public String toString(){
    return "\nPatente: " + patente +" \nCapacidad: " + capacidad + " \nEmpresa: " +empresa;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }



}
