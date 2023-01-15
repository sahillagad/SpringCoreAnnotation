package com.masai.Service;

import java.util.List;

import com.masai.Entity.Student;

public interface StudentService {

	public String addStudent(Student s);
	public String updateStudent(Student s);
	public List<Student> listPersons();
	public Student getStudentById(int roll);
	public String removeStudent(int roll);
	
}
