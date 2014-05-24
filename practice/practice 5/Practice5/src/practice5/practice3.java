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
        
        int option =1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el numero del mes");
       option=Integer.parseInt(teclado.nextLine());
       switch(option){
           case 1:
               
               System.out.println("Enero");
                   break;
               
       }
       
    }
    
}
