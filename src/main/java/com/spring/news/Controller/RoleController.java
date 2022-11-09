package com.spring.news.Controller;

import com.spring.news.Entity.Role;
import com.spring.news.Entity.SidebarRole;
import com.spring.news.Service.RoleService;
import com.spring.news.helper.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {

    @Autowired
    RoleService roleService;

    @GetMapping("getAllRole")
    public ResponseEntity<ApiResponse> getAllRole(){
        ApiResponse apiResponse = new ApiResponse();
        List<Role> roleList = roleService.getAllRole();
        apiResponse.setData(roleList);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("getRoleById/{id}")
    public ResponseEntity<ApiResponse> getRoleById(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        Role role = roleService.getRoleById(id);
        apiResponse.setData(role);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PostMapping("addRole")
    public ResponseEntity<ApiResponse> addRole(@RequestBody Role role){
        ApiResponse apiResponse = new ApiResponse();
        roleService.addRole(role);
        apiResponse.setData(role);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @PutMapping("updateRole")
    public ResponseEntity<ApiResponse> updateRole(@RequestBody Role role){
        ApiResponse apiResponse = new ApiResponse();
        roleService.updateRole(role);
        apiResponse.setData(role);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }

    @DeleteMapping("deleteRole/{id}")
    public ResponseEntity<ApiResponse> updateRole(@PathVariable(name = "id") Integer id){
        ApiResponse apiResponse = new ApiResponse();
        roleService.deleteRole(id);
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
    @GetMapping("getSidebarByRoleId/{role_id}")
    public ResponseEntity<ApiResponse> getSidebarByRoleId(@PathVariable("role_id") Integer role_id){
        ApiResponse apiResponse = new ApiResponse();
        try {
            List<SidebarRole> sidebarRoleList = roleService.getListSidebarByRoleId(role_id);
            apiResponse.setData(sidebarRoleList);
        }catch(NullPointerException ex){
            apiResponse.setErrors(ex.getMessage());
        }
        return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.OK);
    }
}
