package com.spring.news.Service.Impl;

import com.spring.news.Dao.CategoryDao;
import com.spring.news.Entity.Category;
import com.spring.news.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategory() {
        List<Category> categoryList = categoryDao.findAll();
        if(categoryList == null || categoryList.isEmpty()){
            throw new NullPointerException("Category list is empty!");
        }
        return categoryList;
    }

    @Override
    public Category getCategoryById(Integer id) {
        Category categoryList = categoryDao.findById(id).get();
        return categoryList;
    }

    @Override
    public void addCategory(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void updateCategory(Category category) {
        categoryDao.save(category);
    }

    @Override
    public void deleteCategory(Integer id) {
        categoryDao.deleteById(id);
    }
}
