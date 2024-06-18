package com.example.demo2.demo2.model;


import org.springframework.stereotype.Component;

@Component
public class laptop implements Computer {

    public void complie() {
        System.out.println("Complies.....in Laptop");
    }
}
