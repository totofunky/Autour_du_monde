package com.example.thorin_lenain.autourdumonde.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Thorin_LeNain on 16/10/2014.
 */
public class Restos {
    private static Restos instance;
    public static Restos getInstance() {
        if (instance == null) {
            instance = new Restos();
            instance.init();
        }
        return instance;
    }



    Map<String, Resto> lstRestos = new HashMap<String, Resto>();
    private Restos(){

    }

    public void addResto (Resto resto){
        if (!lstRestos.containsKey(resto.getId())){
            lstRestos.put(resto.getId(), resto);
        }
    }

    public ArrayList<Resto> getRestos(){
        return new ArrayList(lstRestos.values());
    }

    public Resto getRestoById(String id){
        return lstRestos.get(id);
    }

    private void init(){
        addResto(new Resto("1", "Japonais", "8 allée de la haie aux prêtre", "Auffargis"));
        addResto(new Resto("2", "Mexicain", "85 rue vesal", "Paris"));
        addResto(new Resto("3", "Americain", "9 port d'ivry", "Ivry"));
        addResto(new Resto("4", "Japonais", "23 rue mouftard", "Paris"));
        addResto(new Resto("5", "Chinois", "21 champs Elysees", "Paris"));
    }

}
