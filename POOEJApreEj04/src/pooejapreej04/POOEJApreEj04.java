/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej04;

import Entidades.Rectangulo;
import Servicio.RectanguloServicio;

/**
 *
 * @author egar0
 */
public class POOEJApreEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RectanguloServicio rs = new RectanguloServicio();
        Rectangulo r1 = rs.crearRectangulo();
        rs.calcularPerimetro(r1);
        rs.calcularSuperficie(r1);
        rs.dibujarRectangulo(r1);
    }
    
}
