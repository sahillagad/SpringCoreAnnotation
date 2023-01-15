package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class MyApplicationContextClass {

	
	@Bean
	public int getStateId() {
		
		
	 return 4;	
		
	}
	

	
	@Bean("cities")
	public List<String> getSmartCities(){
		
		List<String> list=new ArrayList<>();
		
		list.add("MUmbai");
		list.add("Nashik");
		list.add("Pune");
		return list;
	}
	
	@Bean
	public List<String> getCities(){
		
		List<String> list=new ArrayList<>();
		
		list.add("Satara");
		list.add("Nagpur");
		list.add("Kalyan");
		return list;
	}
	

	
	
}
