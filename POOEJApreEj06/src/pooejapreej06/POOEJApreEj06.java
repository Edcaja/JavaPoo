/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej06;

import Entidades.Cafetera;
import Servicio.CafeteraServicio;





/**
 *
 * @author egar0
 */
public class POOEJApreEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     CafeteraServicio cs = new CafeteraServicio();
     Cafetera ca1 = cs.crearCafetera();
     cs.llenarCafetera(ca1);
     cs.servirTaza(ca1);
     cs.vaciarCafetera(ca1);
     cs.agregarCafe(ca1);
    }
    
}
