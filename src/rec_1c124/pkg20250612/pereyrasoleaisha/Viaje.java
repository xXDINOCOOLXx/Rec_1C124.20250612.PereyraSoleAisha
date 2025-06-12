/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rec_1c124.pkg20250612.pereyrasoleaisha;

/**
 *
 * @author Aisha
 */
public class Viaje {
    Usuario humano;
    PasajeComun pasaje;
    VehiculoTransporte transporte;
    int tipoViaje;
    int tipoTransporte;

    public Viaje(Usuario humano, PasajeComun pasaje, int tipoViaje, VehiculoTransporte transporte, int tipoTransporte) {
        this.humano = humano;
        this.pasaje = pasaje;
        this.tipoViaje = tipoViaje;
        this.transporte = transporte;
        this.tipoTransporte = tipoTransporte;
    }
    
    
     @Override
    public String toString(){
    return "\nUSUARIO: " + humano +"\n"
            + "\nPASAJE " + pasaje +"\n"
            + "\nVEHICULO " + transporte +"\n"
            + "\nTIPO DE VIAJE" + tipoViaje +"\n"
            + "\nTIPO DE TRANSPORTE" + tipoTransporte+"\n";
    }

    public Usuario getHumano() {
        return humano;
    }

    public void setHumano(Usuario humano) {
        this.humano = humano;
    }

    public PasajeComun getPasaje() {
        return pasaje;
    }

    public void setPasaje(PasajeComun pasaje) {
        this.pasaje = pasaje;
    }

    public VehiculoTransporte getTransporte() {
        return transporte;
    }

    public void setTransporte(VehiculoTransporte transporte) {
        this.transporte = transporte;
    }

    public int getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(int tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public int getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(int tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }



}
