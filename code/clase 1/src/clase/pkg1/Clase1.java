/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercio # 1
        double N = 0;
        double A = 4;
        char C = '$';
        double suma = 0;
        double diferencia = 0;
        System.out.println("El valor de N es : " + "\n" + N);
        System.out.println("El valor de A es : " + "\n" + A);
        System.out.println("El valor de C es : " + "\n" + C);
         Scanner tecl = new Scanner(System.in);
        System.out.println("Digite el numero" + "\n");
        N= Double.parseDouble(tecl.nextLine());
        suma = N + A;
        System.out.println("La suma de A + N es : " + "\n" + suma);
        diferencia = A - N;
        System.out.println("La diferencia de A - N es : " + "\n" + diferencia);
        System.out.println("El valor de C es : " + "\n" + C);
        // Ejercio #2
        int X = 3;
        int Y = 2;
        double M = 5;
        double n = 9;
        int multiplicar = 0;
        double Suma = 0;
        multiplicar = X * Y;
        System.out.println("La multiplicacion de X por Y es : " + "\n" + multiplicar);
        Suma = X + Y;
        System.out.println("La suma de X mas Y es : " + "\n" + suma);
        //Ejercio #3
        int N1 = 8;
        N1 = (N1 + 77 - 3) * 2;
        System.out.println("El valor de N1 es :" + "\n" + N1);
        //Ejercio #4
        int A1 = 3;
        int B = 4;
        int C1 = 5;
        int D = 4;
        int F = B;
        B = C;
        C1 = A1;
        D = F;
        //Ejercio #5
        double A2 = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite el numero" + "\n");
        A2 = Double.parseDouble(teclado.nextLine());
        if (A2 % 2 == 0) {
            System.out.println("El numero es par ");

        } else {
            System.out.println("El numero es impar ");
        }
        //Ejercio #6 
        double B1 = 0;
        Scanner teclad = new Scanner(System.in);
        System.out.println("Digite el numero" + "\n");
        B1 = Double.parseDouble(teclado.nextLine());
        if (B1 >= 0) {
            System.out.println("El numero es positivo");

        } else {
            System.out.println("El numero es positivo");
        }
        //Ejecio #7 
        double C2=0;
         Scanner tecla = new Scanner(System.in);
        System.out.println("Digite el numero" + "\n");
        C2 = Double.parseDouble(teclado.nextLine());
        if(C2>=0){
            
            System.out.println("El numero es positivo");
        }else System.out.println("El numero es positivo");
       if( C2%5==0){ 
           System.out.println("El numero es multiplo de 5");
           
       }else System.out.println("El numero no multiplo de 5");
       if (C2%10==0){
           System.out.println("El numero es multiplo de 10");
       } else System.out.println("El numero no multiplo de 10"); 





    
    }
    
    
}
