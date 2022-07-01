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
        AutomovilGasolina auto1 = new AutomovilGasolina("Kevin", "LGB-711", 15, 3);
        auto1.establecerIva();
        auto1.calcularValorCancelar();
        System.out.println(auto1);
        AutomovilDiesel auto2 = new AutomovilDiesel("Pablo","HRD-431",10,2.10);
        auto2.establecerDescuentoLitro(5);
        auto2.calcularValorCancelar();
        System.out.println(auto2);
    }
}
