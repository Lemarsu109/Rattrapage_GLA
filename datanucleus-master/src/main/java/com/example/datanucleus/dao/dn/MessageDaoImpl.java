package com.example.datanucleus.dao.dn;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Transaction;

import com.example.datanucleus.dao.Message;
import com.example.datanucleus.dao.MessageDao;

public class MessageDaoImpl implements MessageDao {

    private PersistenceManagerFactory pmf;

	public MessageDaoImpl(PersistenceManagerFactory pmf) {
		this.pmf = pmf;
	}

    @Override
    public void addMessage(Message message) {
        PersistenceManager pm = pmf.getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		try {
			tx.begin();

			pm.makePersistent(message);

			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
        
    }
    
}
