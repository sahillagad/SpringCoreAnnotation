package Com.masai.usecase;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Com.masai.Service.StudentService;
import Com.masai.Service.StudentServiceImpl;

public class GETListStudent {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	  	
	    StudentService service=context.getBean("StudentService",StudentServiceImpl.class);
		
	    Scanner sc=new Scanner(System.in);
	    
	   System.out.println("You Want Look All Student (Y/N)");
	   String result= sc.next();
		
	   if(result.equalsIgnoreCase("Y")) {
	   service.listPersons();
	   }
	   else {
		   
		   System.out.println("Thank You");
	   }
		
		
		
	}
}
