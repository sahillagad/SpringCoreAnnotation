package com.masai;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class State {
	
	@Autowired
	private int stateId;
	
	@Autowired(required = false)
	private String stateName;
	
	@Autowired
	private List<String> cities;
	
	@PostConstruct
	public void initMethod() {
	System.out.println("I am inside the init Method");	
		
	}
	
	@PreDestroy
	public void preDestroyMethod() {
		
		System.out.println("I am inside the pre Destroy Method");	
	
	}
	
	public void showDetail() {
		
		System.out.println("State Id   : "+stateId);
		System.out.println("state Name : "+stateName);
		
		for(String s:cities) {
			
			System.out.println(s);
		}
		
		
	}
	
	
	
	

}
