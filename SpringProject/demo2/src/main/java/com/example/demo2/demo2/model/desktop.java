package com.example.demo2.demo2.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class desktop implements Computer {

    public void complie() {
        System.out.println("Complies.....in desktop ");
    }
}

