package com.example.datanucleus.dao;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Thematique {
    
    public String nom;
    public List<Fil> fils;

    public Thematique(String nom){
        this.nom = nom;
        this.fils = new ArrayList<Fil>();
    } 
}
