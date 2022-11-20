package com.spring.news;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

//@SpringBootApplication
public class Application {
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);

        Set<String> lstMap = new HashSet<>();

        lstMap.add("1");
        lstMap.add("2");
        lstMap.add("3");
        lstMap.add("4");
        lstMap.add("5");
        lstMap.add("3");
        lstMap.add("4");

        for(String set: lstMap)
            System.out.println(set);

    }
}

