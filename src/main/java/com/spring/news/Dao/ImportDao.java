package com.spring.news.Dao;

import com.spring.news.Entity.Import;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ImportDao extends JpaRepository<Import, Integer> {
}
