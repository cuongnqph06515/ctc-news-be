package com.spring.news.Service.Impl;

import com.spring.news.Dao.SenderDao;
import com.spring.news.Entity.Category;
import com.spring.news.Entity.Sender;
import com.spring.news.Service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SenderServiceImpl implements SenderService {
    @Autowired
    SenderDao senderDao;


    @Override
    public List<Sender> getAllSender() {
        List<Sender> senderList = senderDao.findAll();
        if(senderList == null || senderList.isEmpty()){
            throw new NullPointerException("Sender list is empty!");
        }
        return senderList;
    }

    @Override
    public Sender getSenderById(Integer id) {
        Sender sender = senderDao.findById(id).get();
        return sender;
    }

    @Override
    public void addSender(Sender sender) {
        senderDao.save(sender);
    }

    @Override
    public void updateSender(Sender sender) {
        senderDao.save(sender);
    }

    @Override
    public void deleteSender(Integer id) {
        senderDao.deleteById(id);
    }
}
