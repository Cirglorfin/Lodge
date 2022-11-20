package com.example.lodge.data.model;

import java.util.Objects;

public class Grupo {
   private final int id;
    private String nombre;
    private String descripcion;
    private String[] etiquetas;
    private  String[] miembros;
    private String[] admin;
    private String imagen;



    public boolean isPublico() {
        return publico;
    }

    public void setPublico(boolean publico) {
        this.publico = publico;
    }

    public Grupo(int id, String nombre, String descripcion, String[] etiquetas, String[] miembros, String[] admin, String imagen, boolean publico) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.miembros = miembros;
        this.admin = admin;
        this.imagen = imagen;
        this.publico = publico;
    }

    private boolean publico;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getId() {
        return id;
    }

    public Grupo(int id, String nombre, String descripcion, String[] etiquetas, String[] miembros, String imagen, String[] admin) {
       this.id=id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.etiquetas = etiquetas;
        this.miembros = miembros;
        this.admin = admin;
        this.imagen = imagen;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;
        Grupo grupo = (Grupo) o;
        return Objects.equals(getId(), grupo.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String[] getEtiquetas() {
        return etiquetas;
    }

    public void setEtiquetas(String[] etiquetas) {
        this.etiquetas = etiquetas;
    }

    public String[] getMiembros() {
        return miembros;
    }

    public void setMiembros(String[] miembros) {
        this.miembros = miembros;
    }

    public String[] getAdmin() {
        return admin;
    }

    public void setAdmin(String[] admin) {
        this.admin = admin;
    }



    @Override
    public String toString() {
        return nombre;
    }

    public Grupo(int id,String nombre, String[] admin) {
        this.id=id;
        this.nombre = nombre;
        this.admin = admin;
    }
}
