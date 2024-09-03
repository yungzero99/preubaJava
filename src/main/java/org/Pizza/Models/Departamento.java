package org.Pizza.Models;

public class Departamento extends Identified
{
    private String sNombre;
    private String sDescripcion;

    public String getsNombre()
    {
        return sNombre;
    }

    public void setsNombre(String sNombre)
    {
        this.sNombre = sNombre;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }
}
