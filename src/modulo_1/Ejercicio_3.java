/*
 * To change this license header, choose License Headers in Project Properties. 
* To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_1;

import java.util.Scanner;

/**
 *
 * @author Imelda
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int M = 6, T=1, K=-10;
       
        if(M>T){
            
            System.out.println("M>T..........."+" Verdadero");
           
        }
        else{
            System.out.println("M>T..........."+"Falso");
        }

        if(T/K == -5){
            System.out.println("T/K == -5......"+"Verdadero");
        }
        else{
            System.out.println("T/K == -5......"+"Falso");
        }
        
        if(M+T == 7 || M-T==5){
            System.out.println("(M+T == 7) || (M-T == 5)......."+"Verdadero");
        }
        else{
            System.out.println("(M+T == 7) || (M-T == 5)......."+"Falso");
        }
    }
    
}
