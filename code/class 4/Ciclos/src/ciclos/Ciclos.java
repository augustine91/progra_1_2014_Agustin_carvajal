/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * cicle for
         *
         */
        int cantidad;
        int suma = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el numero de impresiones que desea");

        cantidad = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i <= cantidad; i++) {
            System.out.println(i);

        }
        System.out.println("Inverso");

        for (int i = cantidad; i >= 0; i--) {
            System.out.println(i);
        }
        /**
         * cicle while
         */
        while (suma <= cantidad) {
            System.out.print(suma);
            System.out.print("-");
            suma++;
        }
        System.out.print("\n");
        suma = cantidad;
        while (suma >= 0) {
            System.out.print(suma);
            System.out.print("-");
            suma--;
        }
        /**
         * Cicle do while
         */
        System.out.print("\n");
        suma = 0;

        do {
            System.out.print(suma);
            System.out.print("-");
            suma++;
        } while (suma <= cantidad);
        System.out.print("\n");
        suma = cantidad;

        do {
            System.out.print(suma);
            System.out.print("-");
            suma--;
        } while (suma >= 0);
    }
}
