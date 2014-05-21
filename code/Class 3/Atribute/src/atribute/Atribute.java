/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atribute;

import com.sun.java_cup.internal.runtime.Symbol;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Atribute {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account oAccount = new Account();
        Scanner teclado = new Scanner(System.in);
        boolean validar = true;
        int opcion;
        double monto;
        char continuar;
        while (validar) {

            System.out.println("Digite 1 si quiere hacer un deposito y 2 si quiere hacer un retiro ");
            opcion = Integer.parseInt(teclado.nextLine());
            if (opcion == 1) {
                System.out.println("Digite el monto a depositar ");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Deposito(monto);
            }
            if (opcion == 2) {
                System.out.println("Digite el monto a retirar ");
                monto = Double.parseDouble(teclado.nextLine());
                oAccount.Retiro(monto);

                if (oAccount.isHayError()) {
                    System.out.println("El monto no puede ser retirado ");
                }

                System.out.println("El saldo final es de: $" + oAccount.getSaldoinicial());
                System.out.println("Desea continuar con otra transaccion S/N");
                continuar = teclado.nextLine().charAt(0);
                if ((continuar == 'S') || (continuar == 's')) {
                    validar = true;
                }
                if ((continuar == 'N') || (continuar == 'n')) {
                    validar = false;
                }

            }


        }

    }
}
