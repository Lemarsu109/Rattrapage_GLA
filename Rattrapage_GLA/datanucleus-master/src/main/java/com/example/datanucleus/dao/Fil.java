package com.example.datanucleus.dao;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Fil {
    
    public String question;
    public Message description;
    public Thematique theme;
    public List<Message> message;

    public Fil(String question, Message description, Thematique theme){
        this.question = question;
        this.description = description;
        this.theme = theme;
        this.message = new ArrayList<Message>();
        this.message.add(description);
    }
}
