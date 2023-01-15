package com.masai.Usecase;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.Entity.Collage;
import com.masai.Entity.Student;
import com.masai.Service.StudentService;

@Controller
public class InsertStudentUseCase {

	
	@Autowired 
    private StudentService service;
	
	

	public void addStudent() {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Student Name");
		String name= sc.next();
		
		System.out.println("Enter Student Marks");
		int marks=sc.nextInt();
		
		
		System.out.println("Collage Name");
		String colName= sc.next();
	
		System.out.println("Collage Add");
		String add= sc.next();
		
	    Collage collage=new Collage(colName, add);
	    
		
		Student student=new Student(name, marks, collage);
		
		collage.getStudents().add(student);
		service.addStudent(student);
	}

	
	public void updateStudent() {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente Sudent Roll");
		int roll=sc.nextInt(); 
		
		System.out.println("Enter Student Name");
		String name= sc.next();
		
		System.out.println("Enter Student Marks");
		int marks=sc.nextInt();
		
		Student student=new Student(roll, name, marks);
		
		service.updateStudent(student);
		
	}
	public void listPersons(){
		service.listPersons();
		
	}
	public void getStudentById() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente Sudent Roll");
		int roll=sc.nextInt(); 
		
		service.getStudentById(roll);
	}
	public void removeStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ente Sudent Roll");
		int roll=sc.nextInt(); 
		
		service.removeStudent(roll);
		
	}
}
