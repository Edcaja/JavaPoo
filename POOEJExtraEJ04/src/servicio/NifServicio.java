/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Nif;

import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class NifServicio {
    
    char [] LETRA = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','F'};
    Scanner leer = new Scanner(System.in);
    public Nif CrearNif(){
        System.out.println("Ingrese el Numero de DNI");
        long dni =  leer.nextLong();
        char letra = asignarLetra(dni);
         Nif n = new Nif(dni,letra);
         return n;
    }
    public char asignarLetra(long dni){
        int posresto = (int) dni%23;
        return LETRA[posresto];
    }
    public void mostrar(Nif n){
        int dif;
        if(String.valueOf(n.getDni()).length()<8){
            dif = 8-String.valueOf(n.getDni()).length();
            System.out.println("NIF:  ");
            for (int i = 0;i<dif;i++){
                System.out.println("0");
            }
            System.out.println(n.getDni()+ "-" +n.getLetra());
        }else{
            System.out.println("NIF: "+n.getDni()+ "-" +n.getLetra());
        }
    }
}
