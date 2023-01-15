package com.masai.Usecase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;

import com.masai.Entity.Collage;
import com.masai.Entity.MyConfigrationClass;
import com.masai.Entity.Student;
import com.masai.Service.StudentService;
import com.masai.Service.StudentServiceImpl;
@Controller
public class RegisteredStudent {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new AnnotationConfigApplicationContext(MyConfigrationClass.class);
		
 	StudentServiceImpl studentImpl=context.getBean("studentServiceImpl",StudentServiceImpl.class);
		
 	Collage collage=new Collage("Birla College","Mumbai");
 	
 	Student student=new Student("Ram", 564, collage);
 	Student student1=new Student("Tom", 664, collage);
 	Student student2=new Student("Sahil", 774, collage);
 	Student student3=new Student("Jarray", 964, collage);
 	
 	collage.getStudents().add(student);
	collage.getStudents().add(student1);
	collage.getStudents().add(student2);
	collage.getStudents().add(student3);
 	
 	studentImpl.addStudent(student);
		
	}
}
