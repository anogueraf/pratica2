/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paroimpar;

import java.util.Scanner;

/**
 *
 * @author Maria Teresa
 */
public class ParoImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Introduzca un numero");
        int numero = sc.nextInt();
        
                
        int resto= numero % 2 ;
        
        if (resto == 0){
            System.err.println("El numero es par");
        }else {
            System.err.println("El numero es impar");
        }
        
        
    }
    
}
