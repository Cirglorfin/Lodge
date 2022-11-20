package com.example.lodge.data.model;

import com.example.lodge.data.repository.Grupos;

import java.util.List;
import java.util.Objects;

public class Usuario {

    private String username;
    private String email;
    private String password;
    private String imagenP;
    private List<Contacto> contactos;
    private List<Grupos> grupos;

    public List<Grupos> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupos> grupos) {
        this.grupos = grupos;
    }

    public List<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(List<Contacto> contactos) {
        this.contactos = contactos;
    }



    public String getImagenP() {
        return imagenP;
    }

    public void setImagenP(String imagenP) {
        this.imagenP = imagenP;
    }

    public Usuario(String user, String email, String password, String imagenP) {
        this.username = user;
        this.email = email;
        this.password = password;
        this.imagenP = imagenP;
    }

    @Override
    public String toString() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getUsername(), usuario.getUsername()) && Objects.equals(getEmail(), usuario.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getEmail());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario(String user, String email, String password) {
        this.username = user;
        this.email = email;
        this.password = password;
    }
}
