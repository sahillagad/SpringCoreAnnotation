package com.masai.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        A a= context.getBean("a",A.class);
    
        System.out.println("------------Business Logic Call-----------------");
		 
        a.funA();
       
        System.out.println("------------Post Constructor call by spring cotainer-----------------");

        
        ClassPathXmlApplicationContext applicationContext=(ClassPathXmlApplicationContext) context;
        applicationContext.close();
	
		
		
		
	}
}
