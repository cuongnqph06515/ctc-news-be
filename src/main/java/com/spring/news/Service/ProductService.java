package com.spring.news.Service;

import com.spring.news.Entity.Category;
import com.spring.news.Entity.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProduct();
    public Product getProductById(Integer id);
    public void addProduct(Product product);
    public void updateProduct(Product product);
    public void deleteProduct(Integer id);
}
