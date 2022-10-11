package com.spring.news.Dao;

import com.spring.news.Entity.Hub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface HubDao extends JpaRepository<Hub, Integer> {
}
