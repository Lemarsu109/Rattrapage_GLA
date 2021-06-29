package com.example.datanucleus.dao;

import com.example.datanucleus.dao.fake.UtilisateurDaoFakeImpl;
import com.example.datanucleus.dao.fake.MessageDaoFakeImpl;
import com.example.datanucleus.dao.fake.FilDaoFakeImpl;
import com.example.datanucleus.dao.fake.ThematiqueDaoFakeImpl;

public class DAO {

	public static UtilisateurDao getUtilisateurDao() {
		return new UtilisateurDaoFakeImpl();
	}

	public static MessageDao getMessageDao() {
		return new MessageDaoFakeImpl();
	}

	public static FilDao getFilDao() {
		return new FilDaoFakeImpl();
	}

	public static ThematiqueDao getThematiqueDao() {
		return new ThematiqueDaoFakeImpl();
	}

}
