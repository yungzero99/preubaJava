package org.Pizza.Models;

public class Extra extends Identified
{
    private String sNOmbre;
    private double dPrecio;

    public String getsNOmbre() {
        return sNOmbre;
    }

    public void setsNOmbre(String sNOmbre) {
        this.sNOmbre = sNOmbre;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }
}
