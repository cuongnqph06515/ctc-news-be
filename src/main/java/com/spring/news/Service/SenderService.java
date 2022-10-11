package com.spring.news.Service;

import com.spring.news.Entity.Sender;

import java.util.List;

public interface SenderService {
    public List<Sender> getAllSender();
    public Sender getSenderById(Integer id);
    public void addSender(Sender sender);
    public void updateSender(Sender sender);
    public void deleteSender(Integer id);
}
