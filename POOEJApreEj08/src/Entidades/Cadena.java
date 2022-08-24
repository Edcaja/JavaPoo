/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author egar0
 */
public class Cadena {
    private String frase;
    private int longfrase;

    public Cadena() {
    }

    public Cadena(String frase, int longfrase) {
        this.frase = frase;
        this.longfrase = longfrase;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongfrase() {
        return longfrase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongfrase(int longfrase) {
        this.longfrase = longfrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longfrase=" + longfrase + '}';
    }
    
}
