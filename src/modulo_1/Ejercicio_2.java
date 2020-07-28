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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer=new Scanner(System.in);
        
        double suma = 0,resta = 0,multiplicacion = 0,division = 0;
     
        int n1,n2;
        
        System.out.println("ingrese los numeros a calculat");
        n1=leer.nextInt();
        n2=leer.nextInt();
      
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        
        if (n2 !=0){
        division = n1 / n2;
        }
        
        System.out.println("Suma: "+ suma);
        System.out.println("Resta: "+ resta);
        System.out.println("Multiplicación: "+ multiplicacion);
        System.out.println("División: "+ division);
    }
    
}
