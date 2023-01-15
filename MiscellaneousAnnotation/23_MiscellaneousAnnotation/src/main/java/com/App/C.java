package com.App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.masai.bean.A;

@Component
public class C {

	@Autowired
	private A a;
	
	public void funC() {
	
		System.out.println("I am inside the func of C class");
		System.out.println("A class "+a);
		
		
		
		
	}
	
	
}
