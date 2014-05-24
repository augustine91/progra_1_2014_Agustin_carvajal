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
        int numPromedio;
        int suma = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.println("Ingrese el numero");
            numPromedio = Integer.parseInt(teclado.nextLine());
            suma += numPromedio;
        }
        numPromedio = suma / 10;
        System.out.println("El promedio es :" + "\n" + numPromedio);
        // cicle  10.
        System.out.println("\n");
        int calificacion;
        int cont = 0;
        int sumass = 0;
        int promedioss = 0;
        do {
            System.out.println("Digite la nota o cero si desea salir ");
            calificacion = Integer.parseInt(teclado.nextLine());
            if (calificacion < 0 && calificacion >= 10) {
                sumass += calificacion;
                cont++;
                promedioss = sumass / cont;
            } else {
                calificacion = 0;
            }

            System.out.println("El promedio es de : " + "\n" + promedioss);

        } while (calificacion != 0);

        //Cicle 11
        System.out.println("\n");

        int conv;
        for (int i = 1; i <= 10; i++) {
            conv = i * 560;
            System.out.println("$" + i + " " + "son " + conv + "colones ");

        }

        
        //Cicle 12
        System.out.println("\n");
        

        double interes;
        //double total;
        double monto = 1000;
        for (int i = 0; i <= 12; i++) {
            interes = monto * 0.02;
            monto += interes;
        }
        System.out.println("El monto ghanado es : "+"\n" + monto);

       
        //Cicle 13
        System.out.println("\n");

        int nummin = 0;
        int numhora = 0;

        do {
            for (int j = 0; j <= 60; j++) {
                if (j <= 59) {
                    System.out.println(numhora + ":" + nummin + ":" + j);
                }
                if (j >= 60) {
                    nummin++;
                    j = 0;
                }
                if (nummin >= 60) {
                    numhora++;
                    nummin = 0;
                }
                if (numhora == 24) {
                    j = 61;
                }

            }

        } while (numhora != 24);

        //Cicle 14
        System.out.println("/n");

       
        int meses = 1;
        double inte;
        double monto1 = 1000;
        while (monto1 <= 1500) {
            inte = monto * 0.02;
            monto1 += inte;
            meses++;
        }
        System.out.println("Meses" + meses);

           
        //Cicle 15
        System.out.println("\n");
        int numm = 1;
        int filas;

        System.out.println("Digite el nume1ro de filas");
        filas = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= filas; i = i + 2) {

            for (int e = 1; e <= numm; e = e + 2) {
                System.out.print(e + " ");

            }
            numm = i + 2;
            System.out.println("");
        }

    }

}
