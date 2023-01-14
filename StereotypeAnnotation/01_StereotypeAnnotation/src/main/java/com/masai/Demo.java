package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		A aObj= context.getBean("a",A.class);
		
		aObj.funA();
		
		B bObj= context.getBean("b",B.class);
		bObj.funB();
		
		C cObj= context.getBean("c",C.class);
		cObj.funC();
		
		D dObj= context.getBean("d",D.class);
		dObj.funD();
		
		
		
		
	}
}
