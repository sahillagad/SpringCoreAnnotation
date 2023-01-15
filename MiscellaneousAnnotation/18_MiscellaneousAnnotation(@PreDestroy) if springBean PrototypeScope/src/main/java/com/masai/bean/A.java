package com.masai.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class A {


	private B b;
	

	@Autowired 
	public A(B b) {
		super();
		System.out.println("I am inside the Constructor Of A class");
		this.b = b;
	}

	
	@PostConstruct
   public void initMethod() {
	  System.out.println("I am inside the init Method Of The A class"); 
	   
	   
   }

	
	
	@PreDestroy
   public void destroyMethod() {
   System.out.println("Your A object Delete Process Is Start");
	
		
	   
	   
   }

	public void funA() {
		System.out.println("I am inside the funA of A class");
	    System.out.println("B Class : "+b);
	    b.funB();
	 	
		
	}
}
