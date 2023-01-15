package com.masai.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.Entity.MyConfigrationClass;
import com.masai.Usecase.InsertStudentUseCase;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfigrationClass.class);
		
		InsertStudentUseCase studentUseCase= applicationContext.getBean("insertStudentUseCase",InsertStudentUseCase.class);
		
		studentUseCase.addStudent();
		
	}
}
