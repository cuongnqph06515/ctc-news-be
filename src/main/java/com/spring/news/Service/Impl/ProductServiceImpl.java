package com.spring.news.Service.Impl;

import com.spring.news.Dao.CategoryDao;
import com.spring.news.Dao.ProductDao;
import com.spring.news.Entity.Category;
import com.spring.news.Entity.Product;
import com.spring.news.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDaoImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = productDao.findAll();
        return productList;
    }

    @Override
    public Product getProductById(Integer id) {
        Product productList = productDao.findById(id).get();
        return productList;
    }
}
