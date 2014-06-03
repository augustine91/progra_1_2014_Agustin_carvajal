/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class8;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Class8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner OScanner = new Scanner(System.in);
        int option = 0;
        String GuionPalabra;
        String cadena;
        do {
            System.out.println("digite el opcion : ");
            System.out.println("1.Evaluar una palabra");
            System.out.println("2.evaluar una cadena ");
            option = OScanner.nextInt();
            switch (option) {
                case 1:
                    OScanner = new Scanner(System.in);
                    System.out.println("Digite la palabra a evaluar");
                    ejercicio1 pejercicio1 = new ejercicio1();
                    pejercicio1.setCadena(OScanner.nextLine());
                    System.out.println(pejercicio1.alrevez());
                    System.out.println(pejercicio1.palindromo());
                case 2:
                    OScanner = new Scanner(System.in);
                    System.out.println("Digete la cadena a evaluar");
                    ejercicio1 jejercicio1 = new ejercicio1();
                    jejercicio1.setCadena(OScanner.nextLine());
                    System.out.println("Digite la palabra a buscar");
                    GuionPalabra = OScanner.nextLine();
                    System.out.println(jejercicio1.buscapalabra(GuionPalabra));

            }

        } while (option > 0);
    }

}
