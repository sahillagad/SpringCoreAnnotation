package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class A {

	
	@Bean
	public List<Student> getstudents(){
	
		List<Student>  list=new ArrayList<>();
		list.add(new Student(1, "S1", 456));
		list.add(new Student(2, "S2", 556));
		list.add(new Student(3, "S3", 356));
		list.add(new Student(4, "S4", 256));
		list.add(new Student(5, "S5", 856));
		
		return list;
	}
	
	
	public void funA() {

		System.out.println("I am inside the funA of A class");
		
		

	}
}
