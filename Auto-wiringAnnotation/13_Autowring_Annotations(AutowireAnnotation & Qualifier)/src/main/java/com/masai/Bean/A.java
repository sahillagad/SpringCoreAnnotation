package com.masai.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class A {

	@Autowired
	@Qualifier(value = "b5")
	private B b1;
	
	public void funA() {
		
		System.out.println("I am inside the funA Of the A class");
        System.out.println("B class Object "+b1);
        b1.funB();
		
	}
	
	
	
}
