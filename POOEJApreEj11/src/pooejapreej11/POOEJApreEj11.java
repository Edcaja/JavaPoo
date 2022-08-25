/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class POOEJApreEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
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
        Date fecha = new Date(anio-1900,mes-1,dia);
        System.out.println(fecha);
        Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println("De la "+fecha+" al actual "+fechaActual+" pasaron "+ (fechaActual.getYear()-fecha.getYear())+" años.");
    }
    
}
