/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice2;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Practice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * cicle #1
         */
        int numero;
        char A = '*';
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el numero");

        numero = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < numero; i++) {
            System.out.print(A);
        }
        /**
         * cicle #2
         */
        System.out.print("\n");

        int n;
        int y;

        System.out.println("Digite n");
        n = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite y");
        y = Integer.parseInt(teclado.nextLine());
        for (int i = 1; i <= n; i++) {

            if (i % y == 0) {
                System.out.print("*");

            } else {
                System.out.print(i);
            }

        }
        //Cilce #3
        System.out.print("\n");
        double inicial;
        double aumento;
        double Final;
        System.out.println("Digite el numero");
        inicial = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el numero de aumento");
        aumento = Double.parseDouble(teclado.nextLine());
        System.out.println("Digite el numero de aumero final");
        Final = Double.parseDouble(teclado.nextLine());
        for (double i = inicial; i <= Final; i = i + aumento) {

            System.out.print(i);
            System.out.print("\n");

        }

        //cicle #5
        System.out.print("\n");
        int nUm;
        int elevar;
        int RE;

        System.out.println("Digite el numero");
        nUm = Integer.parseInt(teclado.nextLine());
        System.out.println("Digite el numero al que desea elevar");
        elevar = Integer.parseInt(teclado.nextLine());
        RE = nUm;
        for (int i = 1; i < elevar; i++) {
            nUm = nUm * RE;

        }
        System.out.println("El resulatdo es " + nUm);

        //cicle #6
        System.out.print("\n");
        int in = 11111;
        int fi = 99999;
        for (int i = in; i <= fi; i++) {
            System.out.println(i);

        }
        //cicle 7
        System.out.print("\n");
        int cant;
        int Num;
        int par = 0;
        int impar = 0;
        System.out.println("Digite cantidad de numeros");
        cant = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i < cant; i++) {
            System.out.println("Digite el numero");
            Num = Integer.parseInt(teclado.nextLine());
            if (Num % 2 == 0) {
                par++;

            } else {
                impar++;
            }
        }
        System.out.println("La cantidad de numeros pares es " + par);
        System.out.println("La cantidad de numeros impares es " + impar);
        //cicle 8
        System.out.print("\n");
        int nume;
        int mult = 10;
        int resul;
        System.out.println("Digite el numero");
        nume = Integer.parseInt(teclado.nextLine());
        for (int i = 0; i <= 10; i++) {
            resul = nume * i;

            System.out.println(nume + "*" + i + "=" + resul);

        }
        //cicle 9
        System.out.print("\n");
        int prome;
        int cantNu = 0;
        int cont=0;
        while (10<=cont) {            
            cont++;
            System.out.println("Digite los numeros");
            cantNu=Integer.parseInt(teclado.nextLine());
            
            
            
        }

    }

}
