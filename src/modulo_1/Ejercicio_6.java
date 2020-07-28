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
import java.util.*;
public class Ejercicio_6
{
    public static void main(String[] args){

    String nombre;
    int nota;
    
    
    Scanner dato=new Scanner (System.in);
    
    System.out.print("Nombre :");
    nombre = dato.next();

    

    System.out.print("Igrese la nota :  ");
    nota=dato.nextInt();
             
   
              
    if(nota<70){
    System.out.print("Esta Reprobado");
    }
    
    else{
    System.out.print("Esta Aprobado");
    }
}
}
