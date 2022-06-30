/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombrePropietario;
    protected String placa;
    protected int valorCancelar;

    public void establecerNombrePropietario(String nomP) {
        nombrePropietario = nomP;
    }

    public void establecerPlaca(String plac) {
        placa = plac;
    }

    
    public abstract void calcularValorCancelar();

    
    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public int obtenerValorCancelar() {
        return valorCancelar;
    }
    
    @Override
    public String toString() {
        String cadena = String.format("Automovil\n"
                        + "Nombre del propietario: %s\n"
                        + "Placa: %s\n"
                        + "Valor total a cancelar: %d\n",
                  obtenerNombrePropietario(),
                  obtenerPlaca(),
                  obtenerValorCancelar());
        return cadena;
    }  
}
