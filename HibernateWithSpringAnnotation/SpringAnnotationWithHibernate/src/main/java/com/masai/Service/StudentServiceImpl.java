package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dao.StudentDao;
import com.masai.Entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;

	@Override
	public String addStudent(Student s) {
		
		String result=studentDao.addStudent(s);
		
		System.out.println(result);
		return result;
	}

	@Override
	public String updateStudent(Student s) {
	String result=studentDao.updateStudent(s);
		
		System.out.println(result);
		return result;
	}

	@Override
	public List<Student> listPersons() {
		List<Student>  students=studentDao.listPersons();
		
		for(Student student:students) {
			
			
			System.out.println("Roll  : "+student.getRoll());
			System.out.println("Name  : "+student.getName());
			System.out.println("Marks : "+student.getMarks());
		}
		
		return students;
	}

	@Override
	public Student getStudentById(int roll) {
	
		Student student=studentDao.getStudentById(roll);
		 
		System.out.println("Roll  : "+student.getRoll());
		System.out.println("Name  : "+student.getName());
		System.out.println("Marks : "+student.getMarks());
		
		return student;
	}

	@Override
	public String removeStudent(int roll) {
	String result=studentDao.removeStudent(roll);
		
		System.out.println(result);
		return result;
	}
	
}
