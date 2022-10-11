package com.spring.news.Service;

import com.spring.news.Entity.Category;
import com.spring.news.Entity.Role;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRole();
    public Role getRoleById(Integer id);
    public void addRole(Role role);
    public void updateRole(Role role);
    public void deleteRole(Integer id);
}
