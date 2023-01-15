package com.masai.bean;

import java.util.ArrayList;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class MyConfigration {

	
	@Bean("A")
	public A getA() {
		
		A a=new A();
		
		return a;
	}


	
	@Bean
	public B getB() {
		
		B b=new B();
		
		return b;
	}

	
	
}
