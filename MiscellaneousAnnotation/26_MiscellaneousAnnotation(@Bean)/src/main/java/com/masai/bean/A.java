package com.masai.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class A {


	private B b;

	@Autowired
	public void setB(B b) {
		this.b = b;
	}
	

	@PostConstruct
	public void initMethod() {
	System.out.println("I am inside the Init Method");	
		
	}
	





	@PreDestroy
	public void destroyMethod() {
		System.out.println("I am inside the destroy method");
		
		
	}
	
	
	public void funA() {
		System.out.println("i am inside funA class Of A class");

		System.out.println("b object "+b);
		
		b.funB();
	}
	
}
