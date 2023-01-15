package com.masai.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.App.C;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigrationClass.class);
     
	 	 A aObj= context.getBean("a",A.class);
		aObj.funA();
	 	 
		
	}
}
