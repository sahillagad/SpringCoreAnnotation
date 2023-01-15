package com.masai.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        A a= context.getBean("a",A.class);
        A a1= context.getBean("a",A.class);
        
		
		
        if(a==a1) {
        	
        	System.out.println("A class Object scope is Singleton");
        }
        else {
        	
        	System.out.println("A class Object scope is prototype");
        }
		
		
	}
}
