package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ISIDEBAR_ROLE")
public class SidebarRole {

    @Id
    @Column(name = "SIDEBAR_ROLE_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "SIDEBAR_ID")
    private Sidebar sidebar;

    @ManyToOne
    @JoinColumn(name = "PERMISSION_ID")
    private Permission permission;
}
