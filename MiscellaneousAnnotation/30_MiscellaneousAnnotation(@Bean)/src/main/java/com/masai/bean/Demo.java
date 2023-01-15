package com.masai.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigration.class);
	 	A a= context.getBean("A",A.class);
		a.funA();
	 	
		
		
		
	}
}
