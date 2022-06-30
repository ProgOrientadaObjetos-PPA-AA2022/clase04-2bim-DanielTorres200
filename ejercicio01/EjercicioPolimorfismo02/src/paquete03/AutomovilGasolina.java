/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina {

    double numeroGalonesM;
    double costoGalon;
    double iva;
    double valorTotalG;
    
    public AutomovilGasolina(double n, double cg, double i, double valorTG){
        numeroGalonesM = n;
        costoGalon = cg;
        iva = i;
        valorTotalG = valorTG;
    }

    public void establecerNumeroGalones(int numeroG) {
        numeroGalonesM = numeroG;
    }

    public void establecerCostoGalon(double costoG) {
        costoGalon = costoG;
    }

    public void establecerIva(double iv) {
        iva = (valorTotalG * 0.10);
    }
    
    
    public void establecerValorTotalGasolina() {
        valorTotalG = (costoGalon * numeroGalonesM)+ iva;
    }

    public double obtenerNumeroGalones() {
        return numeroGalonesM;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public double obtenerIva() {
        return iva;
    }

    public double obtenerValorTotalGasolina() {
        return valorTotalG;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Vehiculo a Gasolina\n"
                        + "Numero Galones: %s\n"
                        + "Costo Galon: %s\n"
                        + "Iva: %s\n"
                        + "Valor total a pagar G: %d\n",
                  obtenerNumeroGalones(),
                  obtenerCostoGalon(),
                  obtenerIva(),
                  obtenerValorTotalGasolina());
        return cadena;
    }  
}
