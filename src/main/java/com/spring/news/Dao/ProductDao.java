package com.spring.news.Dao;

import com.spring.news.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ProductDao extends JpaRepository<Product, Integer> {
}
