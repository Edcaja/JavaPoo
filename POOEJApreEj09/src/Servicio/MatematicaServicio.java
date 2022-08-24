/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Matematica;

/**
 *
 * @author egar0
 */
public class MatematicaServicio {
    public Matematica crearNumero(){
        Matematica ma = new Matematica();
        return ma;
    }
    public double devolverMayor(Matematica ma){
        if(ma.getNum1()>ma.getNum2()){
            return ma.getNum1();
        }
        return ma.getNum2();
    }
    public void calcularPotencia(Matematica ma){
        double red1,red2;
        red1 =Math.round(ma.getNum1());
        red2 =Math.round(ma.getNum2());
        if(red1>red2){
            System.out.println(red1+" elevado a "+red2+" es igual a: "+Math.pow(red1, red2));
        }else{
            System.out.println(red2+" elevado a "+red1+" es igual a: "+Math.pow(red2, red1));
        }
    }
    public void calcularRaiz(Matematica ma){
        double abs1,abs2;
        abs1 = Math.abs(ma.getNum1());
        abs2 = Math.abs(ma.getNum2());
        if(abs1>abs2){
            System.out.println("La raiz cuadrada de: "+abs2+" es: "+Math.sqrt(abs2)); 
        }else{
            System.out.println("La raiz cuadrada de: "+abs1+" es: "+Math.sqrt(abs1));
        }
    }
}
