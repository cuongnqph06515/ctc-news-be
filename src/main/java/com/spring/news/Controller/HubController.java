package com.spring.news.Controller;

import com.spring.news.Entity.Hub;
import com.spring.news.Service.HubService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("hub")
public class HubController {

    @Autowired
    HubService hubService;

    @GetMapping("getAllHub")
    public ResponseEntity<ApiResponse> getAllHub(){
        ApiResponse apiResponse = new ApiResponse();
        List<Hub> hubList = hubService.getAllHub();
        apiResponse.setData(hubList);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("getHubById/{id}")
    public ResponseEntity<ApiResponse> getHubById(@PathVariable(name = "id") int id){
        ApiResponse apiResponse = new ApiResponse();
        Hub hub = hubService.getHubById(id);
        apiResponse.setData(hub);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("addHub")
    public ResponseEntity<ApiResponse> addHub(@RequestBody Hub hub){
        ApiResponse apiResponse = new ApiResponse();
        hubService.addHub(hub);
        apiResponse.setData(hub);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateHub")
    public ResponseEntity<ApiResponse> updateHub(@RequestBody Hub hub){
        ApiResponse apiResponse = new ApiResponse();
        hubService.updateHub(hub);
        apiResponse.setData(hub);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteHub/{id}")
    public ResponseEntity<ApiResponse> updateHub(@PathVariable(name = "id") int id){
        ApiResponse apiResponse = new ApiResponse();
        hubService.deleteHub(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

}
