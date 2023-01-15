package com.masai.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	
	@Autowired
	private B b;
	
	
	
	
	
	public void funA() {
	System.out.println("I am inside the funA class A");	
	System.out.println("b object address : "+b);
	b.funB();
	
	
		
	}
	
	
}
