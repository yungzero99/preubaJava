package org.Pizza.Models;

public class DetalleExtra extends Identified
{
    private Extra extra;
    private int iCantidad;

    public Extra getExtra() {
        return extra;
    }

    public void setExtra(Extra extra) {
        this.extra = extra;
    }

    public int getiCantidad() {
        return iCantidad;
    }

    public void setiCantidad(int iCantidad) {
        this.iCantidad = iCantidad;
    }
}
