package com.example.datanucleus.dao;

public interface FilDao {
    
    /**
	 * Ajoute un fil de discussion
	 * 
	 * @param fil
	 */
	void addFil(Fil fil);

	/**
     * Ajoute un message à un fil
     * 
	 * @param fil
     * @param message
	 */
	void addMessageToFil(Fil fil, Message message);

}
