/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class CuentaServicio {
    Scanner leer = new Scanner(System.in);
    public Cuenta crearCuenta(){
        
        Cuenta c1 = new Cuenta();
        System.out.println("ingrese el numero de cuenta del cliente");
        c1.setNcuenta(leer.nextInt());
        System.out.println("ingrese el DNI del cliente");
        c1.setDni(leer.nextLong());
        System.out.println("ingrese el saldo actual");
        c1.setSaldoActual(leer.nextInt());
        return c1;
    }
    public void ingresarSaldo(Cuenta c1){
        //Scanner sal = new Scanner(System.in);
       System.out.println("ingrese el monto del saldo a ingresar");
       double insal = leer.nextDouble();
       int nsal = (int) insal+c1.getSaldoActual();
       c1.setSaldoActual(nsal);
      System.out.println("el saldo depues de ingresar el monto es: " +c1.getSaldoActual());
       
    }
    public void retirarSaldo( Cuenta c1){
        System.out.println("ingrese el monto a retirar");
        double retirar = leer.nextDouble();
        int saldoretiro;
        if(retirar >=c1.getSaldoActual()){
            saldoretiro= 0;
              System.out.println("el saldo despues de retirar es: "+saldoretiro);      
        }else{
           saldoretiro =  c1.getSaldoActual()-(int) retirar;
           c1.setSaldoActual(saldoretiro);
            System.out.println("El saldo a retirar es : "+saldoretiro);
            
        }
    }
    public void extracionRapida(Cuenta c1){
        double extra;
        System.out.println("ingresar el monto a retirar por el metodo extraccion rapidad");
        extra = leer.nextDouble();
        double extrasaldo;
        extrasaldo = c1.getSaldoActual()*0.20;
        System.out.println("el 20% DEL SALDO ES: "+extrasaldo);
        if(extra > extrasaldo){
            System.out.println("no puede retirar mas del 20% de su saldo Actual");
            
        }else{
         int nsaldo =(int) extra-c1.getSaldoActual();
         c1.setSaldoActual(nsaldo);
            System.out.println("el Saldo es depues de la extracion rapida es : "+nsaldo);
        }
    }
    public void consultaSaldo(Cuenta c1){
        System.out.println("Su  nuevo Saldo Actual es :"+ c1.getSaldoActual());
    }
    public void mostrainfo(Cuenta c1){
        System.out.println(c1.toString());
    }
}
