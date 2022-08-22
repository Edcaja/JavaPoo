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
public class Cuenta {
    private int Ncuenta;
    private long Dni;
    private int saldoActual;
    private double interes;
    //private double saldoIngresar;
    //private double saldoretirar;
    //Private         
    public Cuenta() {
    }

    public Cuenta(int Ncuenta, long Dni, int saldoActual, double interes) {
        this.Ncuenta = Ncuenta;
        this.Dni = Dni;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNcuenta() {
        return Ncuenta;
    }

    public long getDni() {
        return Dni;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setNcuenta(int Ncuenta) {
        this.Ncuenta = Ncuenta;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "Ncuenta=" + Ncuenta + ", Dni=" + Dni + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
}
