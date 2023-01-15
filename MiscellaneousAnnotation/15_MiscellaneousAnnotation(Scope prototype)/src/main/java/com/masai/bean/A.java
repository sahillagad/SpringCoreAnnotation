package com.masai.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class A {

	@Autowired
	private B b;
	
	
	
	public void funA() {
		System.out.println("I am inside the funA of A class");
	    System.out.println("B Class : "+b);
	    b.funB();
	 	
		
	}
}
