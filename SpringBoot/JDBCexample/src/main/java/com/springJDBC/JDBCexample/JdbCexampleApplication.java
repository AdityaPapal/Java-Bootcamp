package com.springJDBC.JDBCexample;

import com.springJDBC.JDBCexample.model.student;
import com.springJDBC.JDBCexample.service.studentservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JdbCexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JdbCexampleApplication.class, args);

		student std = context.getBean(student.class);
//		std.setRollNo(16);
//		std.setName("Anish");
//		std.setMarks(8);

		studentservice service = context.getBean(studentservice.class);
		service.addstd(std);

		List<student> stds = service.getStudents();
		for(int  i = 0;i < stds.size();i++){
			System.out.println(stds.get(i));
		}

	}
}


// user(std) -------->Services(sdt_services)------>Repo(std_repo)-------->Databases