package com.masai.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class MyConfigration {

	
	@Bean
	public List<Student> getStudentlist(){
   List<Student> list=new ArrayList<>();
   list.add(new Student(1, "Ram", 654));
   list.add(new Student(2, "Sahil", 666));
   list.add(new Student(3, "Rani", 773));
   list.add(new Student(4, "Tom", 435));
   list.add(new Student(5, "Jarray", 555));
	
   return list;
	}
	
	
	@Bean
	public int getcollageid() {
		
	int collageid=56;
		return collageid;
	}
	
	@Bean
	public String getCollageName() {
		
		String collageName="Birla Collage";
		
		
		return collageName;
	}

	

	@Bean
	public String collageName() {
		
		String collageName="MK Collage";
		
		
		return collageName;
	}
	
}
