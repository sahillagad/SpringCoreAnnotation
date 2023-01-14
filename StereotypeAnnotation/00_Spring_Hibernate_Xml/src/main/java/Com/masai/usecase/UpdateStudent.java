package Com.masai.usecase;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.masai.Service.StudentService;
import Com.masai.Service.StudentServiceImpl;
import Com.masai.entity.Student;

public class UpdateStudent {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
  	
    StudentService service=context.getBean("StudentService",StudentServiceImpl.class);
	
    Scanner sc=new Scanner(System.in);
    
    
    System.out.println("Enter Student Roll ");
    int roll= sc.nextInt();
//    
    System.out.println("Enter Student Name ");
    String name=sc.next();
    
    System.out.println("Enter Student Marks ");
    int marks=sc.nextInt();
	
	
	Student student=context.getBean("Sobj", Student.class);		
   student.setRoll(roll);
    student.setName(name);
	student.setMarks(marks);
   
	
	service.updateStudent(student);
	
	
}
	
}
