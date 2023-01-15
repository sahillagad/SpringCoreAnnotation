package com.masai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Student {

	
	@Value("${roll}")
	private int roll;
	
	@Value("${name}")
	private String name;
	
	@Value("${marks}")
	private int marks;
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
