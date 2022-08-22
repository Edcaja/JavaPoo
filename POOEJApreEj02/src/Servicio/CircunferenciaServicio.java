/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class CircunferenciaServicio {
    public Circunferencia cargarCircunferencia(){
    Scanner leer = new Scanner(System.in);
    Circunferencia c1 = new Circunferencia();
    System.out.println("ingrese el radio de la circunferencia");
    c1.setRadio(leer.nextDouble());
    return c1;
}
 public void calcularArea(Circunferencia c1){
     double area;
     area =(c1.getRadio()*c1.getRadio()*3.14);
     System.out.println("El Area de la circunferencia es : " +area);
 }   
 public void calcularPerimetro(Circunferencia c1){
     double perimetro;
     perimetro= (2*3.14*c1.getRadio());
     System.out.println("El perimetro de la circonferencia es : "+perimetro);
 }           
}
