package com.masai.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	
	@Autowired
	private A a;
	/*
	 * Here previously we write Setter injection point 
	 * to insert the dependency 
	 * but @Autowired we give than spring container at run time give setter injection point
	 * we need not write setter method 
	 * with this spring container also resolve dependency first try byname than bytype
	 * if not resolve dependency than it will throw exception
	 * 
	 */
	
	
	public void funB() {
	
	     System.out.println("A class Obj : "+a);
		 a.funA();
		
	}
	
	
	
	
}
