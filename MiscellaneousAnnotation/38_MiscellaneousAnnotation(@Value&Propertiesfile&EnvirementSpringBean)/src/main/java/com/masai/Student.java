package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class Student {

	
//	@Value("${roll}")
//	private int roll;
//	
//	@Value("${name}")
//	private String name;
//	
//	@Value("${marks}")
//	private int marks;
//	
	
    @Autowired
	private Environment env;
	
	
	
	

	public String result() {
		return "Student [roll=" + env.getProperty("roll") + "\n"
				+ " name=" +env.getProperty("name") + "\n"
						+ " marks=" + env.getProperty("marks") + "]";
	}
	
	
	
}
