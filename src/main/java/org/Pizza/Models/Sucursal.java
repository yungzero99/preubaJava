package org.Pizza.Models;

public class Sucursal extends Identified
{
    private String sNombre;
    private String sDescripcion;
    private Departamento Departamento;

    public org.Pizza.Models.Departamento getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(org.Pizza.Models.Departamento departamento) {
        Departamento = departamento;
    }

    public String getsNombre()
    {
        return sNombre;
    }

    public void setsNombre(String sNombre)
    {
        this.sNombre = sNombre;
    }

    public String getsDescripcion()
    {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion)
    {
        this.sDescripcion = sDescripcion;
    }
}

