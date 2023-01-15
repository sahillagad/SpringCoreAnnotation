package com.masai.Usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.Entity.Collage;
import com.masai.Entity.MyConfigrationClass;
import com.masai.Entity.Student;
import com.masai.Service.StudentServiceImpl;
@Controller
public class UpdateStudent {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigrationClass.class);
		
 	StudentServiceImpl studentImpl=context.getBean("studentServiceImpl",StudentServiceImpl.class);
		
 	Collage collage=new Collage(1,"Birla College","Mumbai");

 	Student student=new Student(1,"kkk", 999,collage);
 	
 	studentImpl.updateStudent(student);
		
	}
}
