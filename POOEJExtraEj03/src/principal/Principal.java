/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidades.Raiz;
import servicio.RaizServicio;

/**
 *
 * @author egar0
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaizServicio rs = new RaizServicio();
        Raiz rz = rs.crearRaiz();
       
        rs.calcular(rz);
    }
    
}
