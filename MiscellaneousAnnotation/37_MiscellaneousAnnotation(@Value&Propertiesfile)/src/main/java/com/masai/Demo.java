package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigrationClass.class);

		 Student student= context.getBean("student",Student.class);
		 
		 System.out.println(student);
	}
}
