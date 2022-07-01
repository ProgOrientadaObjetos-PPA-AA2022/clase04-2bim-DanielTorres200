/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    double numeroLitrosD;
    double costoLitro;
    double descuentoLitro;

    public AutomovilDiesel(String n, String p, double nl, double cl) {
        nombrePropietario = n;
        placa = p;
        numeroLitrosD = nl;
        costoLitro = cl;
    }

    public void establecerNumeroLitros(int numeroL) {
        numeroLitrosD = numeroL;
    }

    public void establecerCostoLitro(double costoL) {
        costoLitro = costoL;
    }

    public void establecerDescuentoLitro(double descuentoL) {
        descuentoLitro = ((numeroLitrosD * descuentoL) / 100);
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = costoLitro *  descuentoLitro;
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
        return valorCancelar;
    }

    @Override
    public String toString() {
        String cadena = String.format("Vehiculo a Diesel\n"
                + "%s\n"
                + "Numero Maximo de Litros: %.2f\n"
                + "Costo Maximo de Litros: %.2f\n"
                + "Descuento en Litros: %.2f\n"
                + "Valor Total a Cancelar: %.2f\n",
                super.toString(),
                obtenerNumeroLitros(),
                obtenerCostoLitros(),
                obtenerDescuentoLitro(),
                obtenerValorCancelar());
        return cadena;
    }
}
