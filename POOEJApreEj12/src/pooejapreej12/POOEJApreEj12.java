/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej12;

import entidades.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;

/**
 *
 * @author egar0
 */
public class POOEJApreEj12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner ednu = new Scanner(System.in).useDelimiter("\n");
       PersonaServicio ps = new PersonaServicio();
       Persona pe =  ps.crearPersona();
       System.out.println("La edad de: "+pe.getNombre()+" es: "+ps.calcularEdad(pe));
       System.out.print("Ingrese una edad para verificar si es es mayo o menor a la persona ingresada: ");
       int edadnueva = ednu.nextInt();
       if(ps.menorQue(pe, edadnueva)){
           System.out.println("Es menor");
       } else{
           System.out.println("Es mayor");
       }
        System.out.println("La informacion de la persona es:");
        ps.mostrarPersona(pe);
    }
    
}
