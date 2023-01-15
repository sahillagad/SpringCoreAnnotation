package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan(basePackages = "com.masai")
@PropertySources({
@PropertySource("value.Properties"),
@PropertySource("value2.Properties"),
})
public class MyConfigrationClass {

	


	
	
}
