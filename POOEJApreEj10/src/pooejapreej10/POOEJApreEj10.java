/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej10;

import java.util.Arrays;

/**
 *
 * @author egar0
 */
public class POOEJApreEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double arregloA [] = new double[50];
  
        System.out.println("Inicializo el Arreglo A");
        for(int i = 0; i<arregloA.length;i++){
            arregloA[i]= Math.random();
            //mostras dos decimales
            System.out.print(String.format("%.2f",arregloA[i])+" "); 
            if(i%10==9){
                System.out.println("");
            }
        }
        
        //ordenamos el Arreglo A.
        Arrays.sort(arregloA);
        //imprimimos el arreglo A ordenado.
        System.out.println("Imprimo arreglo A ordenado");
         for (int i = 0; i< arregloA.length;i++){
            System.out.print(String.format("%.2f",arregloA[i])+" ");
            if(i%10==9){
                System.out.println("");
            }
        }
        //compiamos los primero 10 elementos del arreglo A al B.
        double arregloB [] = Arrays.copyOf(arregloA, 20);
        for (int i = 10;i<20;i++){
            arregloB[i]=0.5;
           
        }
System.out.println("---------------------------------------------------------");
        System.out.println("Imprimo el Arreglo B con elementos del arreglo A");
        for (int i = 0; i< arregloB.length;i++){
            System.out.print(String.format("%.2f",arregloB[i])+" "); 
            if(i%10==9){
                System.out.println("");
            }
        }
    }
    
}
 