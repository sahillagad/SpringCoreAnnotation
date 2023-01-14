package com.masai.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class A {

	@Autowired
	private B b1;
	
	public void funA() {
		
		System.out.println("I am inside the funA Of the A class");
        System.out.println("B class Object "+b1);
        b1.funB();
		
	}
	
	
	
}
