package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo4Application {

	public static void main(String[] args) {
	var app = SpringApplication.run(Demo4Application.class, args);
		
		Student  student = app.getBean(Student.class); 
		student.setName("PRAVAT");	
		student.setRoll(10);
		student.getAddress().setCity("Bbsr");
		System.out.println(student.getAddress().getCity());
		System.out.println("Name is "+ student.getName());
		
	}

}
