/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejextraej04;

import entidad.Nif;
import servicio.NifServicio;

/**
 *
 * @author egar0
 */
public class POOEJExtraEJ04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio ns = new NifServicio();
        Nif n = ns.CrearNif();
        ns.mostrar(n);
    }
    
}
