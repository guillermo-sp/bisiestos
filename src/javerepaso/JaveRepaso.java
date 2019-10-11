/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javerepaso;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class JaveRepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado= new Scanner (System.in);
        String esBisiesto="No es bisiesto";
        System.out.println("Introduce un ");
        int anio=teclado.nextInt();
        
        if (anio%4==0){
             esBisiesto="Es bisiesto";
        } else if (anio%100==0){
            esBisiesto="No es bisiesto";
        }else if (anio%400 ==0){
            esBisiesto="Es bisiesto";
        }
         System.out.printf("%s %n ",esBisiesto);
    }
    
}
