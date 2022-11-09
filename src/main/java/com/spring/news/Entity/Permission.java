package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "IPERMISSION")
public class Permission {

    @Id
    @Column(name = "PERMISSION_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @Column(name = "PERMISSION_NAME")
    private String name;

    @Column(name = "DESCRIPTIONS")
    private String description;
}
