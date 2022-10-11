package com.spring.news.Dao;

import com.spring.news.Entity.Sender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface SenderDao extends JpaRepository<Sender, Integer> {
}
