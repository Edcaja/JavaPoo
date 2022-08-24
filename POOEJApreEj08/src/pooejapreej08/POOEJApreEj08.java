/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej08;

import Entidades.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class POOEJApreEj08 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
       CadenaServicio cs = new CadenaServicio();
       Cadena ca = cs.crearCadena();
       System.out.print("ingrese una frase: "); 
       String frase = leer.nextLine();
       ca.setFrase(frase);
       ca.setLongfrase(frase.length());
       cs.mostraVocales(ca);
       cs.invertirFrase(ca);
       System.out.print("Ingrese una letra para buscar: ");
       String letra = leer.nextLine();
       System.out.println("la "+ letra+ " se repite : "+cs.vecesRepetido(ca,letra));
       System.out.print("ingresar una nueva frase para comparar: ");
       String nuevafrase = leer.nextLine();
       cs.compararLongitud(ca, nuevafrase);
       cs.unirFrase(ca, nuevafrase);
       System.out.print("ingrese una caracter para remplazar la letra a: ");
       String caracter = leer.nextLine();
       cs.remplazar(ca, caracter);
       System.out.print("ingrese una nueva letra para buscar en la frase: ");
       String nuevaletra = leer.nextLine();
       System.out.println("¿Contiene la letra ingresada en la frase?: "+cs.contiene(ca, nuevaletra));
        
    }
    
}
