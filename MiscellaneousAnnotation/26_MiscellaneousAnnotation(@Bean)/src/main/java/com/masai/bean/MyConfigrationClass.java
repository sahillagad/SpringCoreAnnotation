package com.masai.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ={"com.masai"})
public class MyConfigrationClass {

	
	@Bean
	public  A getA() {
		
		A a=new A();
		
     return a;	
		
 	}
	
	
	@Bean
	public  B getB() {
		
		B b=new B();
		
     return b;	
		
 	}
	
	
}
