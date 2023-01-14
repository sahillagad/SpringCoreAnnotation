package com.masai;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.C;
import com.masai.Service.B;
import com.masai.repo.D;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		

		try {
		
			A aObj= context.getBean("a",A.class);
			aObj.funA();
			
		} catch (NoSuchBeanDefinitionException e) {
			 
			System.out.println(e.getMessage());
		}
		
		
		
		try {
			
			B bObj= context.getBean("b",B.class);
			bObj.funB();
			
		} catch (NoSuchBeanDefinitionException e) {
			 
			System.out.println(e.getMessage());
		}
		
	
		try {
			
			C cObj= context.getBean("c",C.class);
			cObj.funC();
		} catch (NoSuchBeanDefinitionException e) {
			 
			System.out.println(e.getMessage());
		}



		try {
			
			D dObj= context.getBean("d",D.class);
			dObj.funD();
		} catch (NoSuchBeanDefinitionException e) {
			 
			System.out.println(e.getMessage());
		}


		

		
	
		
		
		
		
	}
}
