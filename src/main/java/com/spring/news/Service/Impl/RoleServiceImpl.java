package com.spring.news.Service.Impl;

import com.spring.news.Dao.RoleDao;
import com.spring.news.Entity.Category;
import com.spring.news.Entity.Role;
import com.spring.news.Entity.SidebarRole;
import com.spring.news.Service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleDao roleDao;

    @Override
    public List<Role> getAllRole() {
        List<Role> roleList = roleDao.findAll();
        if(roleList == null || roleList.isEmpty()){
            throw new NullPointerException("Role list is empty!");
        }
        return roleList;
    }

    @Override
    public Role getRoleById(Integer id) {
        Role role = roleDao.findById(id).get();
        return role;
    }

    @Override
    public void addRole(Role role) {
        roleDao.save(role);
    }

    @Override
    public void updateRole(Role role) {
        roleDao.save(role);
    }

    @Override
    public void deleteRole(Integer id) {
        roleDao.deleteById(id);
    }

    @Override
    public List<SidebarRole> getListSidebarByRoleId(Integer role_id) {
            List<SidebarRole> sibarList = roleDao.getListSidebarByRoleId(role_id);
            if(sibarList == null || sibarList.isEmpty()){
                throw new NullPointerException("Sidebar list is empty!");
            }
            return sibarList;
    }
}
