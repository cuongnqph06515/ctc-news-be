package com.spring.news.Controller;

import com.spring.news.Entity.User;
import com.spring.news.Service.UserService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("getAlls")
    public ResponseEntity<ApiResponse> getAllUsers() {
        ApiResponse object = new ApiResponse();
        List<User> list = userService.getAllUsers();
        object.setCode(200);
        object.setErrors(null);
        object.setStatus(true);
        object.setData(list);
        return new ResponseEntity<ApiResponse>(object, HttpStatus.OK);
    }

}
