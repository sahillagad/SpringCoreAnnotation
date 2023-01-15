package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Collage;
import com.masai.Entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	
	@Autowired
	EntityManager em;
	
	@Override
	public String addStudent(Student s) {
		String result="Student IS Not Add";
		em.getTransaction().begin();
		
		
		em.persist(s);
		result="Student Is Added Successfully..";
		
		
		em.getTransaction().commit();
		
		return result;
	
	}

	@Override
	public String updateStudent(Student s) {
		String result="Student IS Not Update...";
	   Student student=em.find(Student.class,s.getRoll());
		
	    if(student!=null) {
		em.getTransaction().begin();
		
		em.merge(s);
		result="Student Is Update Successfully..";
		
		
		em.getTransaction().commit();
	    }
	    
		return result;
	}

	@Override
	public List<Student> listPersons() {
		List<Student> students=null;
		
		String jpql="select s from Student s";
		Query query= em.createQuery(jpql);
	   
		students=query.getResultList();
		  
		return students;
	}

	@Override
	public Student getStudentById(int roll) {
		Student student=null;
		
	 student=em.find(Student.class, roll);
			
		return student;
	}

	@Override
	public String removeStudent(int roll) {
		String result="student Is Not Remove";
		Student student=em.find(Student.class, roll);
		
		if(student!=null) {
		em.getTransaction().begin();
		
		em.remove(student);
		result="student is remove";
		em.getTransaction().commit();
		}
		
		return result;
	}

	
}
