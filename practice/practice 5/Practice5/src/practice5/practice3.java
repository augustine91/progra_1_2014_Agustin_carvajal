/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice5;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class practice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Ciclo #1
        Scanner teclado = new Scanner(System.in);
        clsCiclo2 sw= new clsCiclo2();
      
        int Mes;
        int numEntero;
        String letra;
        int opt;
       boolean validar=true;
        int DiaM;
        char continuo;
        do {
            System.out.println("Seleccion una opcion:");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            
            opt= Integer.parseInt(teclado.nextLine());
            switch(opt)
            {
                case 1:         
        System.out.println("Digige el numero del mes ");
        Mes = Integer.parseInt(teclado.nextLine());
        System.out.println(sw.mes(Mes));
               break;
                case 2:
        System.out.println("Digite un numero");
        numEntero= Integer.parseInt(teclado.nextLine());
        System.out.println(":"+ " " +sw.numeroEntero(numEntero));
                break;
         case 3:
        System.out.println("Digete  A, B, C, D, E");
        letra= teclado.nextLine();
        System.out.println(sw.letra(letra));
        break;
         case 4:
        int mes1;
        int año3;
        System.out.println("DIGITE EL NUMERO DE MES");
        mes1 = Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL AÑO");
         año3= Integer.parseInt(teclado.nextLine());
         System.out.println("EL NUMERO DE DIAS DEL MES" + " "+ mes1 +" "+ "="+" "+ sw.añoDias(mes1, año3));
          break;
         case 5:
             System.out.println("el numero aleatorio es:"+sw.ramdon());
             break;
         case 6:
        int diaAnterior;
       int mesAnterior;
       int añoAnterior;
        System.out.println("DIGITE EL DIA");
        diaAnterior= Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL MES");
        mesAnterior = Integer.parseInt(teclado.nextLine());
        System.out.println("DIGITE EL AÑO");
        añoAnterior= Integer.parseInt(teclado.nextLine());
        System.out.println("EL DIA ANTERIOR ES:"+ sw.añoAnterior(diaAnterior, mesAnterior, añoAnterior));
        break;
         case 7:
        System.out.println("INGRESE UN DIA EN NUMERO DEL MES");
        DiaM= Integer.parseInt(teclado.nextLine());
        System.out.println("REPORTAR EL DIA:"+ " " + sw.repotarDia(DiaM));
        int diaA, diahoy;
        System.out.println("INGRESE EL PRIMER DIA DEL MES");
        diaA= Integer.parseInt(teclado.nextLine());
        System.out.println("INGRESE EL DIA DE HOY");
        diahoy= Integer.parseInt(teclado.nextLine());
        break;
        default:
            System.err.println("EL NUMERO DE OPCION NO EXISTE");
        System.out.println("DESEA CONTINUAR CON OTRA OPERACION");
            continuo = teclado.nextLine().charAt(0);
            if ((continuo == 's') || (continuo == 'S')) {
                validar = true;
            } else {
                validar = false;
            }           
        
            }
    
}while(validar);

        
    }
}

