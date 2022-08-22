/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author egar0
 */
public class LibroServicio {
    public Libro Cargarlibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Libro lb1 = new Libro();
        System.out.println("Ingrese el numero ISBN del libre");
        lb1.setISBN(leer.nextInt());
        
        System.out.println("Ingresar el titulo del libro");
        lb1.setTítulo(leer.next());
        
        System.out.println("Ingrese el autor del libro");
        lb1.setAuntor(leer.next());
        
        System.out.println("ingrese la cantaidad de paginas");
        lb1.setNpaginas(leer.nextInt());
        
        return lb1;
    }
    public void  Mostrarinfo(Libro lb1){
        System.out.println(lb1.toString());
    }
}
