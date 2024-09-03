package org.Pizza;

import org.Pizza.Models.Identified;

public class Cliente extends Identified
{
    private String sNombre;
    private String sDireccion1;
    private String sDireccion2;
    private String sTelefono1;
    private String sTelefono2;

    public String getsNombre()
    {
        return sNombre;
    }

    public void setsNombre(String sNombre)
    {
        this.sNombre = sNombre;
    }

    public String getsDireccion1()
    {
        return sDireccion1;
    }

    public void setsDireccion1(String sDireccion1)
    {
        this.sDireccion1 = sDireccion1;
    }

    public String getsDireccion2()
    {
        return sDireccion2;
    }

    public void setsDireccion2(String sDireccion2)
    {
        this.sDireccion2 = sDireccion2;
    }

    public String getsTelefono1()
    {
        return sTelefono1;
    }

    public void setsTelefono1(String sTelefono1)
    {
        this.sTelefono1 = sTelefono1;
    }

    public String getsTelefono2()
    {
        return sTelefono2;
    }

    public void setsTelefono2(String sTelefono2)
    {
        this.sTelefono2 = sTelefono2;
    }
}
