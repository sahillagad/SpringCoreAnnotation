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
	
	@Autowired
	private String stateName;
	
	@Autowired
	@Qualifier("getCities")
	private List<String> list;
	
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
		
		for(String s:list) {
			
			System.out.println(s);
		}
		
		
	}
	
	
	
	

}
