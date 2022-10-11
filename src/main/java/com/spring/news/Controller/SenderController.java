package com.spring.news.Controller;

import com.spring.news.Entity.Sender;
import com.spring.news.Service.SenderService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("sender")
public class SenderController {

    @Autowired
    SenderService senderService;

    @GetMapping("getAllSender")
    public ResponseEntity<ApiResponse> getAllSender(){
        ApiResponse apiResponse = new ApiResponse();
        List<Sender> senderList = senderService.getAllSender();
        apiResponse.setData(senderList);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("getSenderById/{id}")
    public ResponseEntity<ApiResponse> getSenderById(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        Sender sender = senderService.getSenderById(id);
        apiResponse.setData(sender);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("addSender")
    public ResponseEntity<ApiResponse> addSender(@RequestBody Sender sender){
        ApiResponse apiResponse = new ApiResponse();
        senderService.addSender(sender);
        apiResponse.setData(sender);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateSender")
    public ResponseEntity<ApiResponse> updateSender(@RequestBody Sender sender){
        ApiResponse apiResponse = new ApiResponse();
        senderService.updateSender(sender);
        apiResponse.setData(sender);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteSender/{id}")
    public ResponseEntity<ApiResponse> updateSender(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        senderService.deleteSender(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}
