package com.example.appliandroid;

import java.io.Serializable;

class Student implements Serializable {
    private String prenom = "";
    private String group = "";
    private String avatar = "";
    private String nom = "";
    private String email = "";

    public  Student(String nom, String email, String prenom, String avatar, String group){
        this.prenom = prenom;
        this.nom = nom;
        this.group = group;
        this.avatar = avatar;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getGroup() {
        return group;
    }


    public void setGroup(String group) {
        this.group = group;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
