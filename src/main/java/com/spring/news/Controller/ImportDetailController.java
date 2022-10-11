package com.spring.news.Controller;

import com.spring.news.Entity.ImportDetail;
import com.spring.news.Entity.Product;
import com.spring.news.Service.ImportDetailService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "import-detail")
public class ImportDetailController {
    @Autowired
    ImportDetailService importDetailService;

    @GetMapping("getAllImportDetail")
    public ResponseEntity<ApiResponse> getAllImportDetail(){
        ApiResponse apiResponse = new ApiResponse();
        List<ImportDetail> importDetailList = importDetailService.getAllImportDetail();
        apiResponse.setData(importDetailList);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("getImportDetailById/{id}")
    public ResponseEntity<ApiResponse> getImportDetailByImportId(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        ImportDetail importDetail = importDetailService.getImportDetailByImportId(id);
        apiResponse.setData(importDetail);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("addImportDetail")
    public ResponseEntity<ApiResponse> addImportDetail(@RequestBody ImportDetail importDetail){
        ApiResponse apiResponse = new ApiResponse();
        importDetailService.addImportDetail(importDetail);
        apiResponse.setData(importDetail);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateImportDetail")
    public ResponseEntity<ApiResponse> updateImportDetail(@RequestBody ImportDetail importDetail){
        ApiResponse apiResponse = new ApiResponse();
        importDetailService.updateImportDetail(importDetail);
        apiResponse.setData(importDetail);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteImportDetail/{id}")
    public ResponseEntity<ApiResponse> updateImportDetail(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        importDetailService.deleteImportDetail(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}
