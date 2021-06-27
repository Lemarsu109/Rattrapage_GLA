package com.example.datanucleus.dao;

public interface UtilisateurDao {
    
    /**
	 * Ajouter un utilisateur a la base de donnees
	 * 
	 * @param user
	 */
	void addUtilisateur(Utilisateur user);

	/**
     * Valide un utilisateur
     * 
	 * @param user
	 */
	void valideUtilisateur(Utilisateur user);

    /**
     * Invalide un utilisateur
     * 
	 * @param user
	 */
	void invalideUtilisateur(Utilisateur user);

    /**
     * Rend un utilisateur administrateur
     * 
	 * @param user
	 */
	void adminUtilisateur(Utilisateur user);

}
