package com.spring.news.Entity;

import java.util.ArrayList;

public class Nav {
    int id;
    String name;
    int parentId;
    ArrayList<Nav> child;

    public Nav(){
    }

    public Nav(int id, String name, int parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public Nav(int id, String name, int parentId, ArrayList<Nav> child) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.child = child;
    }

    public ArrayList<Nav> getChild() {
        return child;
    }

    public void setChild(ArrayList<Nav> child) {
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

}
