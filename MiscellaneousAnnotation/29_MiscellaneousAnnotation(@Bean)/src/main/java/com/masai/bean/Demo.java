package com.masai.bean;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigration.class);
		
	  List<Student> list=context.getBean("students",List.class);

	  for(Student student:list) {
		  
		  System.out.println(student);
	  }
	  
		
	}
}
