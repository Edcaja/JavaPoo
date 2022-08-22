/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejapreej05;

import Entidades.Cuenta;
import Servicio.CuentaServicio;

/**
 *
 * @author egar0
 */
public class POOEJApreEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaServicio cs= new CuentaServicio();
        Cuenta c1 = cs.crearCuenta();
        cs.ingresarSaldo(c1);
        cs.retirarSaldo(c1);
        cs.extracionRapida(c1);
        cs.consultaSaldo(c1);
        cs.mostrainfo(c1);
      
    }
    
}
