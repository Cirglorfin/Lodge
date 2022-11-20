package com.example.lodge.data.repository;

import com.example.lodge.data.model.Grupo;

import java.util.ArrayList;
import java.util.List;

public class Grupos {
    private static Grupos instance;
    private ArrayList<Grupo> list;
    private Grupos()
    {
        list=new ArrayList<>();
        Inicialice();
    }

    public static Grupos getInstance() {
        if (instance == null) {
            instance = new Grupos();
        }
        return instance;
    }

    /**
     * Método que devuelve la lista de redes sociales
     * @return
     */
    public List<Grupo> getList() {
        return list;
    }
    private void Inicialice()
    {


        list.add(new Grupo(1,"g1", new String[]{"abc"}));




    }
}
