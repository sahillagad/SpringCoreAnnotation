package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyApplicationContextClass.class);
	    State state= context.getBean("state",State.class);   
		
	    state.showDetail();
	}
}
