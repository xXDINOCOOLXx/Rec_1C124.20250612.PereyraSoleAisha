/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public class PasajeComun implements Pasaje {
    double precio;

    public PasajeComun(double precio) {
        this.precio = precio;
    }
    
    @Override
    public double pasaje(double precio){
    return precio;
    }

    @Override
    public String toString(){
    return "\nPrecio: " + precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }



}
