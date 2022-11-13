package com.spring.news.Controller;

import com.spring.news.Entity.Category;
import com.spring.news.Service.CategoryService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("getAllCategory")
    public ResponseEntity<ApiResponse> getAllCategory(){
        ApiResponse apiResponse = new ApiResponse();
        List<Category> categoryList = categoryService.getAllCategory();
        apiResponse.setData(categoryList);
        System.out.println("1");
        System.out.println("master 3");
        System.out.println("master 3");
        System.out.println("cuongnguyen2");
        System.out.println("cuongnguyen3");
        return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.OK);
    }

    @GetMapping("getCategoryById/{id}")
    public ResponseEntity<ApiResponse> getCategoryById(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        Category category = categoryService.getCategoryById(id);
        apiResponse.setData(category);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("addCategory")
    public ResponseEntity<ApiResponse> addCategory(@RequestBody Category category){
        ApiResponse apiResponse = new ApiResponse();
        categoryService.addCategory(category);
        apiResponse.setData(category);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateCategory")
    public ResponseEntity<ApiResponse> updateCategory(@RequestBody Category category){
        ApiResponse apiResponse = new ApiResponse();
        categoryService.updateCategory(category);
        apiResponse.setData(category);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteCategory/{id}")
    public ResponseEntity<ApiResponse> updateCategory(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        categoryService.deleteCategory(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}
