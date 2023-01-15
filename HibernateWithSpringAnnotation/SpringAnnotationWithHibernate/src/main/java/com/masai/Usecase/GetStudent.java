package com.masai.Usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.Entity.MyConfigrationClass;
import com.masai.Service.StudentServiceImpl;

@Controller
public class GetStudent {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigrationClass.class);
		
		
 	StudentServiceImpl studentImpl=context.getBean("studentServiceImpl",StudentServiceImpl.class);
		
	studentImpl.getStudentById(1)	;
		
	}
}
