package com.example.datanucleus.dao.fake;

import com.example.datanucleus.dao.Utilisateur;
import com.example.datanucleus.dao.UtilisateurDao;

public class UtilisateurDaoFakeImpl implements UtilisateurDao {

    @Override
    public void addUtilisateur(Utilisateur user) {
        System.out.println("addUtilisateur");
        
    }

    @Override
    public void valideUtilisateur(Utilisateur user) {
        System.out.println("valideUtilisateur");
        
    }

    @Override
    public void invalideUtilisateur(Utilisateur user) {
        System.out.println("invalideUtilisateur");
        
    }

    @Override
    public void adminUtilisateur(Utilisateur user) {
        System.out.println("adminUtilisateur");
        
    }
    
}
