/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel {
    double numeroLitrosD;
    double costoLitro;
    double descuentoLitro;
    double valorTotalD;
    
    public AutomovilDiesel(double n, double cd, double i, double valorTD){
        numeroLitrosD = n;
        costoLitro = cd;
        descuentoLitro = i;
        valorTotalD = valorTD;
    }

    public void establecerNumeroLitros(int numeroL) {
        numeroLitrosD = numeroL;
    }

    public void establecerCostoLitro(double costoL) {
        costoLitro = costoL;
    }

    public void establecerDescuentoLitro(double descuentoL) {
        descuentoLitro = descuentoL;
    }

    public void calcularValorTotalDiesel() {
        valorTotalD = costoLitro - descuentoLitro;
    }

    
    
    public double obtenerNumeroLitros() {
        return numeroLitrosD;
    }

    public double obtenerCostoLitros() {
        return costoLitro;
    }

    public double obtenerDescuentoLitro() {
        return descuentoLitro;
    }

    public double obtenerValorTotalDiesel() {
        return valorTotalD;
    }
    
     @Override
    public String toString() {
        String cadena = String.format("Vehiculo a Diesel\n"
                        + "Numero litros: %s\n"
                        + "Costo litro: %s\n"
                        + "descuentoLitro: %s\n"
                        + "Valor total a pagar D: %d\n",
                  obtenerNumeroLitros(),
                  obtenerCostoLitros(),
                  obtenerDescuentoLitro(),
                  obtenerValorTotalDiesel());
        return cadena;
    }  
}

