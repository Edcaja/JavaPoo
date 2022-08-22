/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author egar0
 */
public class Libro {
  private  int ISBN;
  private String título;
  private String auntor;
  private int npaginas;
  
  //contructores

    public Libro() {
        
    }

    public Libro(int ISBN, String título, String auntor, int npaginas) {
        this.ISBN = ISBN;
        this.título = título;
        this.auntor = auntor;
        this.npaginas = npaginas;
    }
  //get & set

    public int getISBN() {
        return ISBN;
    }

    public String getTítulo() {
        return título;
    }

    public String getAuntor() {
        return auntor;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public void setAuntor(String auntor) {
        this.auntor = auntor;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", t\u00edtulo=" + título + ", auntor=" + auntor + ", npaginas=" + npaginas + '}';
    }
    
}
