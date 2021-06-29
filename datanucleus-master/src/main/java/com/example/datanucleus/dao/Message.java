package com.example.datanucleus.dao;

import java.time.LocalDateTime;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Message {
    
    public Utilisateur user;
    public LocalDateTime date;
    public String texte;
    public int vote;

    public Message(Utilisateur user, LocalDateTime date, String texte){
        this.user = user;
        this.date = date;
        this.texte = texte;
        this.vote = 0;
    }
}
