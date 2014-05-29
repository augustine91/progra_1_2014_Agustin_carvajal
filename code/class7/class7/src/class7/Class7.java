/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class7;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Class7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner oScanner = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("digite el opcion : ");
            System.out.println("1.Ejecicio 1");
            System.out.println("2.Ejecicio 2");
            opt = oScanner.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Digite el correo a evaluar");
                    oScanner = new Scanner(System.in);
                    ejercicio1 oejercicio1 = new ejercicio1(oScanner.nextLine());
                    System.out.println(oejercicio1.ValidarCorreo());
                    break;
                case 2:
                    System.out.println("Digite la cadena a evaluar");
                    ejercicio2 oejercicio2 = new ejercicio2();
                     oScanner = new Scanner(System.in);
                    oejercicio2.setCadena(oScanner.nextLine());
                    System.out.println(oejercicio2.MediaCadena());
                    System.out.println(oejercicio2.ultimoValor());
                    System.out.println(oejercicio2.alrevez());
                    break;

            }
        } while (opt <= 7);
    }

}
