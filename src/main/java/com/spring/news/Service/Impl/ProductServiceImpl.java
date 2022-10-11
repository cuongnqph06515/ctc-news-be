package com.spring.news.Service.Impl;

import com.spring.news.Dao.ProductDao;
import com.spring.news.Entity.Category;
import com.spring.news.Entity.Product;
import com.spring.news.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDao productDao;

    @Override
    public List<Product> getAllProduct() {
        List<Product> productList = productDao.findAll();
        if(productList == null || productList.isEmpty()){
            throw new NullPointerException("Product list is empty!");
        }
        return productList;
    }

    @Override
    public Product getProductById(Integer id) {
        Product productList = productDao.findById(id).get();
        return productList;
    }

    @Override
    public void addProduct(Product product) {
         productDao.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        productDao.deleteById(id);
    }
}
