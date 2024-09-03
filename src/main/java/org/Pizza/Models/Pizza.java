package org.Pizza.Models;

public class Pizza extends Identified
{
    private TipoPizzaEnum TipoPizza;
    private Tamanyo TamanyoPizza;
    private double dPrecio;

    public TipoPizzaEnum getTipoPizza() {
        return TipoPizza;
    }

    public void setTipoPizza(TipoPizzaEnum tipoPizza) {
        TipoPizza = tipoPizza;
    }

    public Tamanyo getTamanyoPizza() {
        return TamanyoPizza;
    }

    public void setTamanyoPizza(Tamanyo tamanyoPizza) {
        TamanyoPizza = tamanyoPizza;
    }

    public double getdPrecio() {
        return dPrecio;
    }

    public void setdPrecio(double dPrecio) {
        this.dPrecio = dPrecio;
    }
}
