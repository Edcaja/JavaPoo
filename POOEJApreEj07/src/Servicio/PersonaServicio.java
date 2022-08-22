/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        
        System.out.print("Ingresar Nombre de la persona: ");
        String nombre =(leer.next());
        System.out.print("Ingrese la edad de la persona: ");
        int edad = (leer.nextInt());
        String sexo;
        do {
        System.out.print("ingrese el sexo de la persona: h-Hombre,m-Mujer,o-Otros : ");
        sexo=(leer.next());
        } while (!(sexo.equalsIgnoreCase("h") || sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("o")));    
        System.out.print("ingrese el peso de la persona: ");
        double peso=(leer.nextDouble());
        System.out.print("ingrese la altura de la persona: ");
        double altura =(leer.nextDouble());
        Persona p1 = new Persona(nombre, edad, sexo, peso, altura);
        return p1;
    }
    public int calcularIMC(Persona p1){
        double IMC;
        double alt = p1.getAltura();
        //int res1,res2,res3;
        IMC = p1.getPeso()/Math.pow(alt,2); //(alt*alt);
        if (IMC>20 && IMC<=25){
           
            //System.out.println("la persona esta en su peso ideal: "+IMC);
           return  0;
        }else if(IMC < 20){
            //System.out.println("la persona esta por debajo de su peso ideal "+IMC);
            return  -1;
        }else{
            //System.out.println("la persona esta con sobrepeso "+IMC);
            return  1;
        }
//        if (IMC < 20){
//            res1 = -1;
//            System.out.println("la persona esta por debajo de su peso ideal"+IMC);
//            return res1;
//        }else if(IMC>20 && IMC<=25){
//            res2 = 0;
//            System.out.println("la persona esta en su peso ideal: "+IMC);
//            return res2;
//        }else if (IMC>25){
//            res3= 1;
//            System.out.println("la persona esta con sobrepeso"+IMC);
//            return res3;
//     }
//        //System.out.println("el idicen de masa corporal de esta persona es: "+IMC);
//       
    }
    public boolean esMayordeEdad (Persona p1){
       
        if (p1.getEdad()<18){
            return false;
        } else{
           return true;
        }
        
    }
            
}