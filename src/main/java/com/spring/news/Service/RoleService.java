package com.spring.news.Service;

import com.spring.news.Entity.Category;
import com.spring.news.Entity.Role;
import com.spring.news.Entity.SidebarRole;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RoleService {
    public List<Role> getAllRole();
    public Role getRoleById(Integer id);
    public void addRole(Role role);
    public void updateRole(Role role);
    public void deleteRole(Integer id);
    List<SidebarRole> getListSidebarByRoleId(Integer role_id);
}
