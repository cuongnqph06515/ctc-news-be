package com.spring.news.Controller;

import com.spring.news.Entity.Product;
import com.spring.news.Service.ProductService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("getAllProduct")
    public ResponseEntity<ApiResponse> getAllProduct(){
        ApiResponse apiResponse = new ApiResponse();
        List<Product> productList = productService.getAllProduct();
        apiResponse.setData(productList);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("getProductById/{id}")
    public ResponseEntity<ApiResponse> getProductById(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        Product product = productService.getProductById(id);
        apiResponse.setData(product);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("addProduct")
    public ResponseEntity<ApiResponse> addProduct(@RequestBody Product product){
        ApiResponse apiResponse = new ApiResponse();
        productService.addProduct(product);
        apiResponse.setData(product);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateProduct")
    public ResponseEntity<ApiResponse> updateProduct(@RequestBody Product product){
        ApiResponse apiResponse = new ApiResponse();
        productService.updateProduct(product);
        apiResponse.setData(product);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteProduct/{id}")
    public ResponseEntity<ApiResponse> updateProduct(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        productService.deleteProduct(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}
