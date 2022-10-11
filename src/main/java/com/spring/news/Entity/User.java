package com.spring.news.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "IUSERS")
public class User {

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "c_generator")
    @SequenceGenerator(name = "c_generator", sequenceName = "AUTO_INCREMENT_SEQUENCE", allocationSize = 1,initialValue = 7)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID")
    private Role role_id;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORDD")
    private String password;

    @Column(name = "CODE")
    private String code;

    @Column(name = "FULLNAME")
    private String fullname;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "GENDER")
    private Integer gender;

    @Column(name = "STATUS")
    private Integer status;

}
