package com.example.lodge.data.repository;

import android.os.Build;

import com.example.lodge.data.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    private static Usuarios instance;
    private ArrayList<Usuario> list;
    private ArrayList<String> nombresUsuarios=new ArrayList<>();
    public Usuarios()
    {
        list=new ArrayList<>();
        InicialiceUsuarios();
        InicialiceNombres();

    }

    public static Usuarios getInstance() {
        if (instance == null) {
            instance = new Usuarios();
        }
        return instance;
    }

    /**
     * Método que devuelve la lista de redes sociales
     * @return
     */
    public List<Usuario> getList() {
        return list;
    }

    public ArrayList<String> getNombresUsuarios() {
        return nombresUsuarios;
    }

    public void setNombresUsuarios(ArrayList<String> nombresUsuarios) {
        this.nombresUsuarios = nombresUsuarios;
    }

    private void InicialiceNombres()
    {

            for (int i=0;i<list.size();i++)
            {
                nombresUsuarios.add(list.get(i).getUsername());
            }

    }
    private void InicialiceUsuarios()
    {


        list.add(new Usuario("abc","abc@abc.com","123"));
        list.add(new Usuario("abcd","abcd@abcd.com","123"));



    }
}
