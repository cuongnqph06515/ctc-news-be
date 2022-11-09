package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ISIDEBAR")
public class Sidebar {
    @Id
    @Column(name = "SIDEBAR_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @Column(name = "SIDEBAR_URL")
    private String url;

    @Column(name = "ICON")
    private String icon;

    @Column(name = "SIDEBAR_NAME")
    private String name;

    @Column(name = "TITLE")
    private int title;

    @Column(name = "PARENT_ID")
    private int parentId;
}
