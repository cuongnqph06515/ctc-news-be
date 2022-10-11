package com.spring.news.Service;

import com.spring.news.Entity.Category;
import com.spring.news.Entity.Product;

import java.util.List;

public interface ProductDao {

    public List<Product> getAllProduct();

    public Product getProductById(Integer id);
}
