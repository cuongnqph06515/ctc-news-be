package com.spring.news.Dao;

import com.spring.news.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {
}
