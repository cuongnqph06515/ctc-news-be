package com.spring.news.Entity;

import lombok.Data;

import java.util.ArrayList;


public class Sidebar {
    int id;
    String name;
    int parentId;
    ArrayList<Sidebar> child;

    public Sidebar(int id, String name, int parentId, ArrayList<Sidebar> child) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.child = child;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public ArrayList<Sidebar> getChild() {
        return child;
    }

    public void setChild(ArrayList<Sidebar> child) {
        this.child = child;
    }
}
