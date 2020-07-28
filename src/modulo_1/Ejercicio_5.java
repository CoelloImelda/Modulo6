/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_1;
/**
 *
 * @author Imelda
 */
public class Ejercicio_5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [][] arreglos ={  {"Walter",  "Snachez",  "Ing. Producción Industrial","","\n"},
                                 {"Eduardo", "Baraona",  "Ing. Producción Industrial","","\n"},
                                 {"Aylin",   "Funez",    "Ing. En Computación","","\n"},
                                 {"Job",     "Canales",  "Ing. Electrónica","","\n"},
                                 {"Luz",    "Espinoza",  "Ing. Producción Industrial","","\n"}, 
                          };
    
    String arreglo="";
    
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
           arreglo+= arreglos[i][j]+"        ";
        }
        arreglo+="";
    }
    
    System.out.println("" +arreglo);

    }
    
}

