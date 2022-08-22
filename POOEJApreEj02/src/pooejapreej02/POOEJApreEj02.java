/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej02;

import Entidad.Circunferencia;
import Servicio.CircunferenciaServicio;

/**
 *
 * @author egar0
 */
public class POOEJApreEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircunferenciaServicio cs = new CircunferenciaServicio();
        Circunferencia c1 = cs.cargarCircunferencia();
        cs.calcularArea(c1);
        cs.calcularPerimetro(c1);
    }
    
}
