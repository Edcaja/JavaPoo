/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej07;

import Entidades.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author egar0
 */
public class POOEJApreEj07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio [] ps = new PersonaServicio[4];
//        Persona p1 = ps.crearPersona();
//        Persona p2 = ps.crearPersona();
//        Persona p3 = ps.crearPersona();
//        Persona p4 = ps.crearPersona();
                
//        int  calcp1 = ps.calcularIMC(p1);
//        System.out.println("¿La persona es mayor?: "+ps.esMayordeEdad(p1));
//        boolean mayorp1 = ps.esMayordeEdad(p1);
//        
//        int  calcp2 = ps.calcularIMC(p2);
//        System.out.println("¿La persona es mayor?: "+ps.esMayordeEdad(p2));
//        boolean mayorp2 = ps.esMayordeEdad(p2);
//        
//        int calcp3 = ps.calcularIMC(p3);
//        System.out.println("¿La persona es mayor?: "+ps.esMayordeEdad(p3));
//        boolean mayorp3 = ps.esMayordeEdad(p3);
//        
//        int calcp4 = ps.calcularIMC(p4);
//        System.out.println("¿La persona es mayor?: "+ps.esMayordeEdad(p4));            
//        boolean mayorp4 = ps.esMayordeEdad(p4); 
//        int contimc =0;
            int bajopeso = 0;
            int pesonormal = 0;
            int sobrepeso = 0 ;  
            int mayor = 0 ;       
        for (int i = 0;i<4;i++){
            
            ps[i] = new PersonaServicio();
            Persona p1 = ps[i].crearPersona();
            switch (ps[i].calcularIMC(p1)){
                case -1:
                    System.out.println(p1.getNombre()+" está por debajo de su peso ideal");
                    bajopeso++;
                    break;
                case 0:
                    System.out.println(p1.getNombre()+" esta en su peso ideal.");
                    pesonormal++;
                    break;
                case 1:
                    System.out.println(p1.getNombre()+"  esta con sobrepeso.");
                    sobrepeso++;
                    break;    
            }
           if (ps[i].esMayordeEdad(p1)){
               System.out.println(p1.getNombre()+"  es mayo de edad");
               mayor++;
           }else {
               System.out.println(p1.getNombre()+"  es menor de edad");
           } 
        }
        System.out.println((bajopeso)*25+" % se encuntra por debajo de su peso ideal");
        System.out.println((pesonormal)*25+" % se ecuntra con peso normal");
        System.out.println((sobrepeso)*25+" % se ecnmutra con sobre peso");
        System.out.println("\n"+(mayor)*25+"% son mayores de edad");
        System.out.println((4-mayor)*25+"% son menores de edad ");
    }

}
