package com.spring.news.Controller;

import com.spring.news.Entity.Nav;
import com.spring.news.Entity.Sender;
import com.spring.news.Entity.User;
import com.spring.news.Service.UserService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    void getNavbar(ArrayList<Nav> lstNavbar, ArrayList<Nav> array){
        ArrayList<Nav> fake = new ArrayList<>();
        for(int i=0; i< lstNavbar.size(); i++){
            ArrayList<Nav> lstFake = new ArrayList<>();
            for(int j=0; j< array.size(); j++) {
                if(lstNavbar.get(i).getId()==array.get(j).getParentId()) {
                    lstFake.add(array.get(j));
                }
            }
            if(lstFake.size()>0){
                getNavbar(lstFake, array);
                lstNavbar.get(i).setChild(lstFake);
            }
        }
    }

    @GetMapping("nav")
    public ResponseEntity<ApiResponse> getNavbar() {

        ArrayList<Nav> lstNav = new ArrayList<>();
        lstNav.add(new Nav(1, "mot", 12,null));
        lstNav.add(new Nav(2, "hai", 0,null));
        lstNav.add(new Nav(3, "ba", 0,null));
        lstNav.add(new Nav(4, "bon", 0,null));
        lstNav.add(new Nav(5, "nam", 1,null));
        lstNav.add(new Nav(6, "sau", 1,null));
        lstNav.add(new Nav(7, "bay", 6,null));
        lstNav.add(new Nav(8, "tam", 7,null));
        lstNav.add(new Nav(9, "gg", 2,null));
        lstNav.add(new Nav(10, "hg", 2,null));
        lstNav.add(new Nav(11, "er", 2,null));
        lstNav.add(new Nav(12, "ddf", 0,null));

        UserController userController = new UserController();
        userController.getNavbar(lstNav, lstNav);

        ApiResponse object = new ApiResponse();
        object.setData(lstNav);
        return new ResponseEntity<ApiResponse>(object, HttpStatus.OK);
    }

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
