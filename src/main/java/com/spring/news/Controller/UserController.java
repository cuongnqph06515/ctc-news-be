package com.spring.news.Controller;

import com.spring.news.Entity.User;
import com.spring.news.Service.UserService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("getAlls")
    public ResponseEntity<ApiResponse> getAllUsers() {
        ApiResponse object = new ApiResponse();
        List<User> list = userService.getAllUsers();
        object.setData(list);
        return new ResponseEntity<ApiResponse>(object, HttpStatus.OK);
    }

    @GetMapping("getUserByUsername")
    public ResponseEntity<ApiResponse> getUserByUsername(@RequestParam(name = "username") String username){
        ApiResponse object = new ApiResponse();
        User user = userService.getUserByUsername(username);
        object.setData(user);
        return new ResponseEntity<ApiResponse>(object, HttpStatus.OK);
    }

    @PostMapping("addUser")
    public ResponseEntity<ApiResponse> addSender(@RequestBody User user){
        ApiResponse apiResponse = new ApiResponse();
        userService.addUser(user);
        apiResponse.setData(user);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateUser")
    public ResponseEntity<ApiResponse> updateUser(@RequestBody User user){
        ApiResponse apiResponse = new ApiResponse();
        userService.updateUser(user);
        apiResponse.setData(user);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteUser/{id}")
    public ResponseEntity<ApiResponse> updateUser(@PathVariable(name = "id") int id){
        ApiResponse apiResponse = new ApiResponse();
        userService.deleteUser(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

}
