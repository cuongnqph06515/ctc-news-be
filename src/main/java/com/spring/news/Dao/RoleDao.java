package com.spring.news.Dao;

import com.spring.news.Entity.Role;
import com.spring.news.Entity.SidebarRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleDao extends JpaRepository<Role, Integer> {
    @Query("from SidebarRole sr where sr.role.id = :role_id")
    List<SidebarRole> getListSidebarByRoleId(@Param("role_id") Integer role_id);
}
