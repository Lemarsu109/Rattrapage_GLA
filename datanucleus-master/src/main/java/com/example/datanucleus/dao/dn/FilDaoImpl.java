package com.example.datanucleus.dao.dn;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.example.datanucleus.dao.Fil;
import com.example.datanucleus.dao.FilDao;
import com.example.datanucleus.dao.Message;

public class FilDaoImpl implements FilDao {

    private PersistenceManagerFactory pmf;

	public FilDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

    @Override
    public void addFil(Fil fil) {
        PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(fil);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
        
    }

    @Override
    public void addMessageToFil(Fil fil, Message message) {
        // TODO Auto-generated method stub
        
    }

	@Override
	public void suppFil(Fil fil) {
		// TODO Auto-generated method stub
		
	}
    
}
