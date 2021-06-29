package com.example.datanucleus.dao.dn;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.example.datanucleus.dao.Fil;
import com.example.datanucleus.dao.Thematique;
import com.example.datanucleus.dao.ThematiqueDao;

public class ThematiqueDaoImpl implements ThematiqueDao {

    private PersistenceManagerFactory pmf;

	public ThematiqueDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

    @Override
    public void addThematique(Thematique thematique) {
        PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(thematique);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
        
    }

    @Override
    public void addFilToThematique(Thematique thematique, Fil fil) {
        // TODO Auto-generated method stub
        
    }

	@Override
	public void suppThematique(Thematique thematique) {
		// TODO Auto-generated method stub
		
	}
    
}
