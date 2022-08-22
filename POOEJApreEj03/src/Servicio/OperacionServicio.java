/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class OperacionServicio {
    public Operacion crearOperacion(){
        Scanner leer = new Scanner(System.in);
        Operacion op1 = new Operacion();
        
        System.out.println("Ingrese el primer numero");
        op1.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        op1.setNumero2(leer.nextInt());
        
        return op1;
    }
  public double OperacionSumar(Operacion op1){
     
    return op1.getNumero1()+op1.getNumero2();
 }
 
  public double OperacionResta(Operacion op1){
      
    return op1.getNumero1()-op1.getNumero2();
 }
  public void OperacionMultiplicacion(Operacion op1){
      if (op1.getNumero1()*op1.getNumero2()== 0){
          System.out.println("Error");
      } else{
          System.out.println(op1.getNumero1()*op1.getNumero2());
      } 
  }
   public void OperacionDivision(Operacion op1){
      if(op1.getNumero2() ==0){
          System.out.println("Error");  
          
      }else {
          System.out.println(op1.getNumero1()/op1.getNumero2());
      }
    
   }     
}
