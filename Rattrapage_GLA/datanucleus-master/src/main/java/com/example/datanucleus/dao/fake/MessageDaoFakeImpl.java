package com.example.datanucleus.dao.fake;

import com.example.datanucleus.dao.Message;
import com.example.datanucleus.dao.MessageDao;

public class MessageDaoFakeImpl implements MessageDao {

    @Override
    public void addMessage(Message message) {
        System.out.println("addMessage");
        
    }
    
}
