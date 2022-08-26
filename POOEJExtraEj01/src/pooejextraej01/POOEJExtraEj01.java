/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextraej01;

import entidades.Cancion;
import servicio.CancionServicio;

/**
 *
 * @author egar0
 */
public class POOEJExtraEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CancionServicio cs = new CancionServicio();
        Cancion ca = cs.altaCancion();
        System.out.println("La informacion : "+ca.toString());
    }
    
}
