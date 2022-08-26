/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextraej02;

import entidades.Punto;
import servicio.PuntoServicio;

/**
 *
 * @author egar0
 */
public class POOEJExtraEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PuntoServicio ps = new PuntoServicio();
       Punto pun = ps.crearPunto();
       System.out.println("La distancia entre lso dos punto es: "+ps.calcularDistancia(pun));
    }
    
}
