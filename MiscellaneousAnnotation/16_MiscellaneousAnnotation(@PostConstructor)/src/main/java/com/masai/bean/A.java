package com.masai.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
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


	public void funA() {
		System.out.println("I am inside the funA of A class");
	    System.out.println("B Class : "+b);
	    b.funB();
	 	
		
	}
}
