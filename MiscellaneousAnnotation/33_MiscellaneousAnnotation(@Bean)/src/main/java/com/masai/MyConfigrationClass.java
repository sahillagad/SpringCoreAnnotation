package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class MyConfigrationClass {

	@Bean
	public String getName() {
		
		return "Birla Collage";
	}
	@Bean
	public int getId() {
		
		return 1;
	}
	
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

	
	
}
