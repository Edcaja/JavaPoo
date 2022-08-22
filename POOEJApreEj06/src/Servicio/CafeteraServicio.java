/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cafetera;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class CafeteraServicio {
  Scanner leer = new Scanner(System.in);
    public Cafetera crearCafetera(){
        Cafetera ca1 = new Cafetera();
        ca1.setCapacidadMaxima(400);
        ca1.setCantidadActual(0);
        
        return ca1;
    }
    public void llenarCafetera(Cafetera ca1){
        //cantidad actual igual a cantidad maxima
        ca1.setCantidadActual(ca1.getCapacidadMaxima());
        System.out.println("la cafetera esta llena "+ca1.getCantidadActual());
    }
    public void servirTaza(Cafetera ca1){
        System.out.println("ingrese capacidad de la taza");
        int capataza = leer.nextInt();
        if (ca1.getCantidadActual() > capataza){
            System.out.println("sirviendo taza");
            ca1.setCantidadActual(ca1.getCantidadActual()-capataza);
            System.out.println("quedo en la cefetera "+ca1.getCantidadActual());
        }else{
           //int capacidadnueva2 = (ca1.getCantidadActual()-capataza);
           //ca1.setCantidadActual(capacidadnueva2);
           System.out.println("La taza no se pudo llenar, solo se pudo servir: "+ca1.getCantidadActual());
           ca1.setCantidadActual(0);
        }
    }
    public void vaciarCafetera(Cafetera ca1){
        ca1.setCantidadActual(0);
        System.out.println("la cafetera quedo vacia");
    }
    public void agregarCafe(Cafetera ca1){
        int agregar;
        System.out.println("ingrese la cantidad de cafe para ageragar.");
        agregar = leer.nextInt();
        if (ca1.getCantidadActual()+agregar >= ca1.getCapacidadMaxima()){
            ca1.setCantidadActual(ca1.getCapacidadMaxima());
            System.out.println("no se puede agregar mas cafe");
        } else{
            ca1.setCantidadActual(ca1.getCantidadActual()+agregar);
            System.out.println("la cafetera se lleno hasta "+ca1.getCantidadActual());
        }
        
    }
}
