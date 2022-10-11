package com.spring.news.Service.Impl;

import com.spring.news.Dao.HubDao;
import com.spring.news.Entity.Hub;
import com.spring.news.Entity.Sender;
import com.spring.news.Service.HubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HubServiceImpl implements HubService {

    @Autowired
    HubDao hubDao;

    @Override
    public List<Hub> getAllHub() {
        List<Hub> hubList = hubDao.findAll();
        if(hubList == null || hubList.isEmpty()){
            throw new NullPointerException("Hub list is empty!");
        }
        return hubList;
    }

    @Override
    public Hub getHubById(int id) {
        Hub hub = hubDao.findById(id).get();
        return hub;
    }

    @Override
    public void addHub(Hub sender) {
        hubDao.save(sender);
    }

    @Override
    public void updateHub(Hub sender) {
        hubDao.save(sender);
    }

    @Override
    public void deleteHub(int id) {
        hubDao.deleteById(id);
    }
}
