package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigrationClass.class);
        Collage collage= context.getBean("collage",Collage.class); 
		 
        collage.showCollage();
		
		
	}
}
