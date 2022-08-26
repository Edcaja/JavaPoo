/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Punto;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class PuntoServicio {
    public Punto crearPunto(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los valores para las Coordenadas");
        
        System.out.print("Coordenada X1: ");
        int x1 = leer.nextInt();
        System.out.print("Coordenada Y1: ");   
        int y1 = leer.nextInt();
        System.out.print("Coordenada X2: ");
        int x2 = leer.nextInt();
        System.out.print("Coordenada Y2: ");
        int y2 = leer.nextInt();
        Punto pun = new Punto(x1, y1, x2, y2);
        return pun;        
    }
    public double calcularDistancia(Punto pun){
        double distancia;
        distancia = Math.sqrt(Math.pow(pun.getX2()-pun.getX1(), 2)+Math.pow(pun.getY2()-pun.getY1(), 2));
        return distancia;
    } 
    
}
