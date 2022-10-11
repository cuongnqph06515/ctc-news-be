package com.spring.news.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IROLE")
public class Role {

    @Id
    @Column(name = "ROLE_ID")
    private Integer role_id;

    @Column(name = "ROLE_CODE")
    private String role_code;

    @Column(name = "ROLE_NAME")
    private String role_name;

    @Column(name = "DESCRIPTIONS")
    private String description;

    public Role(){

    }

    public Role(Integer role_id, String role_code, String role_name, String description) {
        this.role_id = role_id;
        this.role_code = role_code;
        this.role_name = role_name;
        this.description = description;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_code() {
        return role_code;
    }

    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
