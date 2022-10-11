package com.spring.news.Service;

import com.spring.news.Entity.Category;

import java.util.List;

public interface CategoryService {
    public List<Category> getAllCategory();
    public Category getCategoryById(Integer id);
    public void addCategory(Category category);
    public void updateCategory(Category category);
    public void deleteCategory(Integer id);
}
