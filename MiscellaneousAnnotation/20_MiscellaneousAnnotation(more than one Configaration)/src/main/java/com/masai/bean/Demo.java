package com.masai.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigrationClass.class,MyConfigrationClass2.class)
				;
      // ApplicationContext is interface 
     //	AnnotationConfigApplicationContext	is a implemaint class of the interface
	// in that we pass our configration classs
	// if more than one application configartion class	
		
		
		
		
		
		
	}
}
