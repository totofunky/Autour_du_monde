package com.example.thorin_lenain.autourdumonde.model;

/**
 * Created by Thorin_LeNain on 16/10/2014.
 */
public class Resto {
    private String id;
    private String titre;

    @Override
    public String toString() {
        return titre + " " + adresse + " " +carte ;
    }

    private String adresse;
    private String carte;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getCarte() {
        return carte;
    }

    public void setCarte(String carte) {
        this.carte = carte;
    }

    public Resto(String id, String titre, String adresse, String carte){
        this.id = id;
        this.titre =titre;
        this.adresse = adresse;
        this.carte = carte;
    }
}
