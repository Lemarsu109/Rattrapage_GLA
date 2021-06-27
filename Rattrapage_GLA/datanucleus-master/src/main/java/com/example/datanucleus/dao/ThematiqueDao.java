package com.example.datanucleus.dao;

public interface ThematiqueDao {
    
	/**
	 * Ajoute une thematique
	 * 
	 * @param thematique
	 */
	void addThematique(Thematique thematique);

	/**
	 * Ajoute un fil de discussion a la thematique
	 * 
	 * @param thematique
	 * @param fil
	 */
	void addFilToThematique(Thematique thematique, Fil fil);

}
