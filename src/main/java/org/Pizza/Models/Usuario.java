package org.Pizza.Models;

public class Usuario extends Identified
{
    private String sNombre;
    private String sApellido;
    private String sNombreUsuario;
    private String sContrasenya;

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getsNombreUsuario() {
        return sNombreUsuario;
    }

    public void setsNombreUsuario(String sNombreUsuario) {
        this.sNombreUsuario = sNombreUsuario;
    }

    public String getsContrasenya() {
        return sContrasenya;
    }

    public void setsContrasenya(String sContrasenya) {
        this.sContrasenya = sContrasenya;
    }
}
