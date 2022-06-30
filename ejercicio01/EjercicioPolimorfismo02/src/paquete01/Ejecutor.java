/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        AutomovilGasolina automovilG = new AutomovilGasolina();
        AutomovilDiesel automovilD = new AutomovilDiesel();
    }
}
