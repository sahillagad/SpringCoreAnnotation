package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.masai")
public class MyConfigrationClass {

	@Bean
	public String getName() {
		
		return "Birla Collage";
	}
	@Bean
	public int getId() {
		
		return 1;
	}
	


	
	
}
