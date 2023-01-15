package com.masai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Student {

	
	@Value("100")
	private int roll;
	
	@Value("Sahil")
	private String name;
	
	@Value("567")
	private int marks;
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
