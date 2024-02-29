package com.example.fxproject.entities;


public class Participation {



        private int id_par;
        private String nom_par;
        private String prenom_par;
        private String age_par;
        private int id_event;
        private int id_user;

    public Participation() {
    }

    public Participation(int id_par, String nom_par, String prenom_par, String age_par, int id_event, int id_user) {
        this.id_par = id_par;
        this.nom_par = nom_par;
        this.prenom_par = prenom_par;
        this.age_par = age_par;
        this.id_event = id_event;
        this.id_user = id_user;
    }

    public Participation(String nom_par, String prenom_par, String age_par, int id_event, int id_user) {
        this.nom_par = nom_par;
        this.prenom_par = prenom_par;
        this.age_par = age_par;
        this.id_event = id_event;
        this.id_user = id_user;
    }

    public Participation(String nom_par, String prenom_par, String age_par, int id_event) {
        this.nom_par = nom_par;
        this.prenom_par = prenom_par;
        this.age_par = age_par;
        this.id_event = id_event;
    }

    public void setId_par(int id_par) {
        this.id_par = id_par;
    }

    public void setNom_par(String nom_par) {
        this.nom_par = nom_par;
    }

    public void setPrenom_par(String prenom_par) {
        this.prenom_par = prenom_par;
    }

    public void setAge_par(String age_par) {
        this.age_par = age_par;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public void setId_user(int id_parent) {
        this.id_user = id_user;
    }

    public int getId_par() {
        return id_par;
    }

    public String getNom_par() {
        return nom_par;
    }

    public String getPrenom_par() {
        return prenom_par;
    }

    public String getAge_par() {
        return age_par;
    }

    public int getId_event() {
        return id_event;
    }

    public int getId_user() {
        return id_user;
    }

    @Override
    public String toString() {
        return "Participation{" +
                "id_par=" + id_par +
                ", nom_par='" + nom_par + '\'' +
                ", prenom_par='" + prenom_par + '\'' +
                ", age_par='" + age_par + '\'' +
                ", id_event=" + id_event +
                ", id_user=" + id_user +
                '}';
    }
}
