package com.example.datanucleus.dao.dn;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.example.datanucleus.dao.Utilisateur;
import com.example.datanucleus.dao.UtilisateurDao;

public class UtilisateurDaoImpl implements UtilisateurDao {
    
    private PersistenceManagerFactory pmf;

	public UtilisateurDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

	public void addUtilisateur(Utilisateur user) {
		PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(user);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

    @Override
    public void valideUtilisateur(Utilisateur user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void invalideUtilisateur(Utilisateur user) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void adminUtilisateur(Utilisateur user) {
        // TODO Auto-generated method stub
        
    }

}
