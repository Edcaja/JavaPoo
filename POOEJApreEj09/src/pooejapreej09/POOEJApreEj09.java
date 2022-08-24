/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej09;

import Entidades.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author egar0
 */
public class POOEJApreEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica ma = ms.crearNumero();
        double n1,n2;
        n1 = Math.random();
        n2 = Math.random();
        ma.setNum1(n1);
        ma.setNum2(n2);
        System.out.println(ma.getNum1()); 
        System.out.println(ma.getNum2());
        System.out.println("El mayor es: "+ms.devolverMayor(ma));
        ms.calcularPotencia(ma);
        ms.calcularRaiz(ma);
    }
    
}
