/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public class Usuario {
    String nombre;
    int tipo;

    public Usuario(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    
     @Override
    public String toString(){
    return "\nNombre: " + nombre + "\nTipo de pasajero: " +tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }



}
