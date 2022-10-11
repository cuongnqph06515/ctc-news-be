package com.spring.news.Service;

import com.spring.news.Entity.Category;
import com.spring.news.Entity.Sender;

import java.util.List;

public interface SenderDao {
    public List<Sender> getAllSender();

    public Sender getSenderById(Integer id);
}
