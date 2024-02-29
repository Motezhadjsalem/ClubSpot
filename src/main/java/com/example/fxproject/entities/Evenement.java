package com.example.fxproject.entities;
import java.sql.Date;


public class Evenement {


    private int id_event;
    private Date date_event;
    private int capacite_event;
    private String localisation;
    private String nom_club;
    private String description;
    private String type_event;
    private String image_event;

    public Evenement() {

    }


    public Evenement( Date date_event, int capacite_event, String localisation, String nom_club, String description, String type_event, String image_event) {

        this.date_event = date_event;
        this.capacite_event = capacite_event;
        this.localisation = localisation;
        this.nom_club = nom_club;
        this.description = description;
        this.type_event = type_event;
        this.image_event = image_event;
    }
    public Evenement(int id_event, Date date_event, int capacite_event, String localisation, String nom_club, String description, String type_event) {
        this.id_event = id_event;
        this.date_event = date_event;
        this.capacite_event = capacite_event;
        this.localisation = localisation;
        this.nom_club = nom_club;
        this.description = description;
        this.type_event = type_event;
        this.image_event = image_event;
}
    public int getId_event() {
        return id_event;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public Date getDate_event() {
        return date_event;
    }

    public void setDate_event(Date date_event) {
        this.date_event = date_event;
    }

    public int getCapacite_event() {
        return capacite_event;
    }

    public void setCapacite_event(int capacite_event) {
        this.capacite_event = capacite_event;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getNom_club() {
        return nom_club;
    }

    public void setNom_club(String organisateur) {
        this.nom_club = organisateur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType_event() {
        return type_event;
    }

    public void setType_event(String type_event) {
        this.type_event = type_event;
    }

    public String getImage_event() {
        return image_event;
    }

    public void setImage_event(String image_event) {
        this.image_event = image_event;
    }

    @Override
    public String toString() {
        return "Evenement{" +
                "id_event=" + id_event +
                ", date_event=" + date_event +
                ", capacite_event=" + capacite_event +
                ", localisation='" + localisation + '\'' +
                ", nom_club='" + nom_club + '\'' +
                ", description='" + description + '\'' +
                ", type_event='" + type_event + '\'' +
                ", image_event='" + image_event + '\'' +
                '}';
    }
}





