package com.masai;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class Student {

	
	@Autowired 
	private Environment env;
	

	private int roll;
	
	private String name;
	

	private int marks;

	@PostConstruct
	public void initMethod() {
		this.roll= Integer.parseInt(env.getProperty("roll"));
		this.name=env.getProperty("name");
		this.marks= Integer.parseInt(env.getProperty("marks"));
		
	}










	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
}
