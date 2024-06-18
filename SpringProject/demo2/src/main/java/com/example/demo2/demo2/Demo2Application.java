package com.example.demo2.demo2;

import com.example.demo2.demo2.model.laptop;
import com.example.demo2.demo2.services.laptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Demo2Application.class, args);

		laptop lap = context.getBean(laptop.class);
		laptopService services = context.getBean(laptopService.class);
		services.addlaptop(lap);
	}
// Laptop(user) -----> services(laptopService)-------->repository
}
