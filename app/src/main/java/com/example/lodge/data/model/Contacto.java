package com.example.lodge.data.model;

import java.util.Objects;

public class Contacto {
    public Contacto(Usuario usuario, String nombrecontacto) {
        this.usuario = usuario;
        this.nombrecontacto = nombrecontacto;
    }

    private Usuario usuario;
    private String nombrecontacto;

    @Override
    public String toString() {
        return nombrecontacto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contacto)) return false;
        Contacto contacto = (Contacto) o;
        return Objects.equals(getUsuario(), contacto.getUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsuario());
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getNombrecontacto() {
        return nombrecontacto;
    }

    public void setNombrecontacto(String nombrecontacto) {
        this.nombrecontacto = nombrecontacto;
    }
}
