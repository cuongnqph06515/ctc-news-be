package com.spring.news.Controller;

import com.spring.news.Entity.Import;
import com.spring.news.Service.ImportService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("import")
public class ImportController {
    @Autowired
    ImportService importService;

    @GetMapping("getAllImport")
    public ResponseEntity<ApiResponse> getAllImport(){
        ApiResponse apiResponse = new ApiResponse();
        List<Import> importList = importService.getAllImport();
        apiResponse.setData(importList);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("getImportById/{id}")
    public ResponseEntity<ApiResponse> getImportById(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        Import anImport = importService.getImportById(id);
        apiResponse.setData(anImport);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("addImport")
    public ResponseEntity<ApiResponse> addImport(@RequestBody Import anImport){
        ApiResponse apiResponse = new ApiResponse();
        importService.addImport(anImport);
        apiResponse.setData(anImport);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateImport")
    public ResponseEntity<ApiResponse> updateImport(@RequestBody Import anImport){
        ApiResponse apiResponse = new ApiResponse();
        importService.updateImport(anImport);
        apiResponse.setData(anImport);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteImport/{id}")
    public ResponseEntity<ApiResponse> updateImport(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        importService.deleteImport(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}
