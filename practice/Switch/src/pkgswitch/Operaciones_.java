/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

/**
 *
 * @author Home
 */
public class Operaciones_ {

    public double Sumar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double Resta(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double divicion(double valor1, double valor2) {
        if (valor2 == 0) {
            return 0;

        } else {
            return valor1 / valor2;
        }
    }

    public double Multiplcacion(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double Raiz(double valor1, double valor2) {
        return Math.sqrt(valor1);
    }
    public double Potencia(double valor1, double valor2){
        return Math.pow(valor1, valor2);
    }
}
