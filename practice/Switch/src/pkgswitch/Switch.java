/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean validar = true;
        double valor1 = 0;
        double valor2 = 0;
        double resultado;
        char continuar;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        Operaciones_ aOperaciones_=new Operaciones_();
        do {
            System.out.println("Digite la operacion a evaluar ");
            System.out.println("1.Suma ");
            System.out.println("2.Resta ");
            System.out.println("3.Division ");
            System.out.println("4.Multiplicacion ");
            System.out.println("5.Raiz ");
            System.out.println("6.Potencia ");
            opcion=Integer.parseInt(teclado.nextLine());
            switch(opcion)
            { case 1:
                System.out.println("Digite el valor del primer digito");
                valor1=Double.parseDouble(teclado.nextLine());
                System.out.println("Digite el valor del segundo digito");
                valor2=Double.parseDouble(teclado.nextLine());
                resultado=aOperaciones_.Sumar(valor1, valor2);
                System.out.println(resultado);
                break;
                case 2:
                System.out.println("Digite el valor del primer digito");
                valor1=Double.parseDouble(teclado.nextLine());
                System.out.println("Digite el valor del segundo digito");
                valor2=Double.parseDouble(teclado.nextLine());
                resultado=aOperaciones_.Resta(valor1,valor2);
                    System.out.println(resultado);
                break;
                case 3:
                System.out.println("Digite el valor del primer digito");
                valor1=Double.parseDouble(teclado.nextLine());
                System.out.println("Digite el valor del segundo digito");
                valor2=Double.parseDouble(teclado.nextLine());
                resultado=aOperaciones_.divicion(valor1,valor2);
                    System.out.println(resultado);
                break;
                case 4:
                System.out.println("Digite el valor del primer digito");
                valor1=Double.parseDouble(teclado.nextLine());
                System.out.println("Digite el valor del segundo digito");
                valor2=Double.parseDouble(teclado.nextLine());
                resultado=aOperaciones_.Multiplcacion(valor1,valor2);
                    System.out.println(resultado);
                break;
                case 5:
                System.out.println("Digite el valor del primer digito");
                valor1=Double.parseDouble(teclado.nextLine());
                resultado=aOperaciones_.Raiz(valor1,valor2);
                    System.out.println(resultado);
                break;
                case 6:
                System.out.println("Digite el valor del primer digito");
                valor1=Double.parseDouble(teclado.nextLine());
                System.out.println("Digite el valor del segundo digito");
                valor2=Double.parseDouble(teclado.nextLine());
                resultado=aOperaciones_.Potencia(valor1,valor2);
                    System.out.println(resultado);
                break;
            }

            System.out.println("Desea continuar con otra operacion S/N ");
            continuar = teclado.nextLine().charAt(0);
            if ((continuar == 'S') || (continuar == 's')) {
                validar = true;

            } else {
                validar = false;
            }

        } while (validar);

    }

   
    
}
