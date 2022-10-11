package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "IHUB")
public class Hub {
    @Id
    @Column(name = "HUB_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "HUB_NAME")
    private String hubName;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "DISTRICT")
    private String district;

    @Column(name = "HOTLINE")
    private String hotline;

    @Column(name = "DESCRIPTIONS")
    private String description;

    @Column(name = "STATUS")
    private Integer status;

}
