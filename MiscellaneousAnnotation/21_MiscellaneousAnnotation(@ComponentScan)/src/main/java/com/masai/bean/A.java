package com.masai.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

	@Autowired
	private B b;
	
	
	public void funA() {
		System.out.println("i am inside funA class Of A class");

		System.out.println("b object "+b);
		
		b.funB();
	}
	
}
