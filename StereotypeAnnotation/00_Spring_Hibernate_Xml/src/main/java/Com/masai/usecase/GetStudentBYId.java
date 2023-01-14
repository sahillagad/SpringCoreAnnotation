package Com.masai.usecase;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.masai.Service.StudentService;
import Com.masai.Service.StudentServiceImpl;

public class GetStudentBYId {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	  	
	    StudentService service=context.getBean("StudentService",StudentServiceImpl.class);
		
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter Student Roll ");
	    int roll= sc.nextInt();
	    
	    
	    service.getStudentById(roll);
		
		
		
	}
}
