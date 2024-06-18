package com.example.demo2.demo2.services;

import com.example.demo2.demo2.Repositories.laptoprepo;
import com.example.demo2.demo2.model.laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class laptopService {

        @Autowired
        private laptoprepo repo;


        public void addlaptop(laptop lap){
            repo.save(lap);
        }

        public boolean isGood(laptop lap){
            return true;
        }
}
