/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public class PasajeEstudiante extends PasajeComun implements Pasaje{

    public PasajeEstudiante(double precio) {
        super(precio);
    }

    @Override
    public double pasaje(double precio){
    return 0.5*precio;
    }
}
