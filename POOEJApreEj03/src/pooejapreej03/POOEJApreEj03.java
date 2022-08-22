/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej03;

import Entidades.Operacion;
import Servicio.OperacionServicio;

/**
 *
 * @author egar0
 */
public class POOEJApreEj03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionServicio os = new OperacionServicio();
        Operacion op1 = os.crearOperacion();
        System.out.println("El resultado de la suma es: " + os.OperacionSumar(op1));
        System.out.println("El resultado de la resta es: "+ os.OperacionResta(op1));
        os.OperacionMultiplicacion(op1);
        os.OperacionDivision(op1);
    }
    
}
