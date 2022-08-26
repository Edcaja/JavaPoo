/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        System.out.print("Ingrese el nombre de la persona: ");
        String nomper = leer.nextLine();
        int dia,mes,anio;
        do {
            System.out.print("Ingrese dia: ");
            dia = leer.nextInt();
        }while (dia<1 || dia>31);
        do{
            System.out.print("Ingrese mes: ");
            mes=leer.nextInt();
        }while (mes<1 || mes >12);
        do{
            System.out.print("Ingrese Año: ");
            anio = leer.nextInt();
        }while(anio<0 || anio >9999);
        Date fechanac = new Date(anio-1900,mes-1,dia);
        Persona pe = new Persona(nomper,fechanac);
        return pe;
    }
    public int calcularEdad(Persona pe){
        Date fechaActual = new Date();
        return(fechaActual.getYear()-pe.getFechaNacimiento().getYear());
    }
    public boolean menorQue(Persona pe, int edad){
      return calcularEdad(pe)>edad;
    }
    public void mostrarPersona(Persona pe){
        System.out.println(pe.toString());
    }
}
