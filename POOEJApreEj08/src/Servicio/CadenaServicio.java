/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class CadenaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
            public Cadena crearCadena(){
                Cadena ca = new Cadena();
             return ca;           
            }
     public int mostraVocales(Cadena ca){
         int cont = 0;
         for (int i = 0; i<ca.getLongfrase();i++){
             char letra = ca.getFrase().toLowerCase().charAt(i);
             if (letra == 'a' || letra == 'e'||letra == 'i'||letra == 'o'||letra == 'u'){
                 cont++;
             }
         }
         return cont;
     }   
     public void invertirFrase(Cadena ca){
          for (int i = 0; i<ca.getLongfrase();i++){
              System.out.print(ca.getFrase().substring(ca.getLongfrase()-1-i, ca.getLongfrase()-i));
          }
          System.out.println("");
     }
     public int vecesRepetido(Cadena ca, String letra){
         int repetida = 0;
          for (int i = 0; i<ca.getLongfrase();i++){
              if (ca.getFrase().toLowerCase().charAt(i)==letra.toLowerCase().charAt(0)){
                  repetida++;
              }
          } 
          return repetida;
     }
     public void compararLongitud(Cadena ca, String frase){
         if(ca.getLongfrase()>frase.length()){
             System.out.println("La nueva frase ingresada es mas corta que la frase original");
         }else if(ca.getLongfrase()< frase.length()){
             System.out.println("La nueva frase ingresada es mas larga que la frase original");
         }else{
             System.out.println("las dos frases tienen la misma longitud");
         }
     }
     public void unirFrase(Cadena ca, String frase){
         System.out.println("La frase unida es: "+ca.getFrase().concat(frase));   
     }
     public void remplazar(Cadena ca, String letra){
         System.out.println(ca.getFrase().replace('a', letra.charAt(0)));
     }
     public boolean contiene(Cadena ca, String letra){
         return ca.getFrase().contains(letra);
     }
}
