package com.example.datanucleus.dao.fake;

import com.example.datanucleus.dao.Fil;
import com.example.datanucleus.dao.FilDao;
import com.example.datanucleus.dao.Message;

public class FilDaoFakeImpl implements FilDao {

    @Override
    public void addFil(Fil fil) {
        System.out.println("addFil");
        
    }

    @Override
    public void addMessageToFil(Fil fil, Message message) {
        System.out.println("addMessageToFil");
        
    }

    @Override
    public void suppFil(Fil fil) {
        System.out.println("suppFil");
        
    }
    
}
