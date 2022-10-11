package com.spring.news.Service;
import com.spring.news.Entity.Hub;

import java.util.List;

public interface HubService {
    public List<Hub> getAllHub();
    public Hub getHubById(int id);
    void addHub(Hub hub);
    void updateHub(Hub hub);
    void deleteHub(int id);
}
