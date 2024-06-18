package com.example.demo2.demo2.Repositories;

import com.example.demo2.demo2.model.laptop;
import org.springframework.stereotype.Repository;

@Repository
public class laptoprepo {
    public void save(laptop lap){
        System.out.println("save in database");
    }
}
