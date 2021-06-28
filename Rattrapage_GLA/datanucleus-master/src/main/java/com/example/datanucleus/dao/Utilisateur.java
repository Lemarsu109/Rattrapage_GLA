package com.example.datanucleus.dao;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Utilisateur {
    
    public String pseudo;
    protected String email;
    protected String mdp;
    protected boolean valide;
    protected boolean admin;

    public Utilisateur(String pseudo, String email, String mdp){
        this.pseudo = pseudo;
        this.email = email;
        this.mdp = mdp;
        this.valide = false;
        this.admin = false;
    }

    public boolean getValide(){
        return valide;
    }

    public void setValide(boolean bool){
        this.valide = bool;
    }

    public boolean getAdmin(){
        return admin;
    }

    public void setAdmin(boolean bool){
        this.admin = bool;
    }

}
