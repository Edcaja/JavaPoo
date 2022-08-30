/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Raiz;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class RaizServicio {
    public Raiz crearRaiz(){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Se pediran las 3 Coeficinetes A-B-C");
        System.out.print("Ingrese el Coeficinete A: ");
        double a = leer.nextDouble();
        System.out.print("Ingrese el coeficiente B: ");
        double b = leer.nextDouble();
        System.out.print("Ingrese el coeficiente C: ");
        Double c = leer.nextDouble();
        Raiz rz = new Raiz(a, b, c);
        return rz;
    }
    public double getDiscriminante(Raiz rz){
        double discriminar = Math.pow(rz.getB(),2)-4*rz.getA()*rz.getC();
        
        return discriminar;
    }
    public boolean tieneRaices(Raiz rz){
        return getDiscriminante(rz) >0;
    }
    public boolean tieneRaiz(Raiz rz){
       return getDiscriminante(rz) == 0;
    }
    public void obtenerRaices(Raiz rz){
        if (tieneRaices(rz) == true){
            System.out.println((-rz.getB()+Math.sqrt(getDiscriminante(rz)))/(2*rz.getA()));
            System.out.println((-rz.getB()-Math.sqrt(getDiscriminante(rz)))/(2*rz.getA()));
        }
    }
    public void obtenerRaiz(Raiz rz){
        if(tieneRaiz(rz)== true){
            System.out.println(-rz.getB()/(2*rz.getA()));
        }
    }
    public void calcular(Raiz rz){
        if(tieneRaiz(rz)){
            obtenerRaiz(rz);
        }else if (tieneRaices(rz)){
            obtenerRaices(rz);
        }else{
            System.out.println("no se econtro solucion posible");
        }
    }
}
