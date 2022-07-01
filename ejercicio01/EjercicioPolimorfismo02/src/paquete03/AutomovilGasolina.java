/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    double numeroGalonesM;
    double costoGalon;
    double iva;

    public AutomovilGasolina(String n, String p, double ng, double cg) {
        nombrePropietario = n;
        placa = p;
        numeroGalonesM = ng;
        costoGalon = cg;
    }

    public void establecerNumeroGalones(double c) {
        numeroGalonesM = c;
    }

    public void establecerCostoGalon(double c) {
        costoGalon = c;
    }

    public void establecerIva() {
        iva = 10;
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = (costoGalon * numeroGalonesM) + (((costoGalon * numeroGalonesM) * iva) / 100);;
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

    @Override
    public String toString() {
        String cadena = String.format("Vehiculo a Gasolina\n"
                + "%s\n"
                + "Numero Galones: %s\n"
                + "Costo Galon: %s\n"
                + "Iva: %s\n"
                + "Valor total a pagar G: %.2f\n",
                super.toString(),
                obtenerNumeroGalones(),
                obtenerCostoGalon(),
                obtenerIva(),
                obtenerValorCancelar());
        return cadena;
    }
}
