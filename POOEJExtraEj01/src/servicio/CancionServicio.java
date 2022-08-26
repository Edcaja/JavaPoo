/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class CancionServicio {
    public Cancion altaCancion(){
       Scanner leer = new Scanner(System.in).useDelimiter("\n");
       System.out.print("Ingrese el titulo de la cancion: ");
       String ti = leer.nextLine();
       System.out.print("Ingrese el autor de la cancion: ");
       String aut = leer.nextLine();
       Cancion ca = new Cancion(ti,aut);
       return ca;
    }
}
