package com.masai.Dao;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Collage;
import com.masai.Entity.Student;

@Repository
public class CollageDaoImpl implements CollageDao{


	@Autowired
	EntityManager em;
	
	@Override
	public String addCollage(Collage c) {
		String result="Collage IS Not Add";
		em.getTransaction().begin();
		
		
		em.persist(c);
		result="Collage Is Added Successfully..";
		
		
		em.getTransaction().commit();
		
		return result;
	}

	@Override
	public String updateCollage(Collage c) {
		String result="Collage IS Not Update...";
	    Collage collage=em.find(Collage.class,c.getCollageId());
		
	    if(collage!=null) {
		em.getTransaction().begin();
		
		
		em.refresh(c);
		result="Collage Is Update Successfully..";
		
		
		em.getTransaction().commit();
	    }
	    
		return result;
	}

	@Override
	public List<Collage> listPersons() {
	List<Collage> collages=null;
	
	String jpql="select c from Collage c";
	Query query= em.createQuery(jpql);
   
	collages=query.getResultList();
	  
	return collages;
		
	}

	@Override
	public Collage getStudentById(int id) {
	Collage collage=null;
	
	Student student=em.find(Student.class, id);
		
	return student.getCollage();
	}

	@Override
	public String removeCollage(int id) {
	String result="College Is Not Remove";
		Collage collage=em.find(Collage.class, id);
		
		if(collage!=null) {
		em.getTransaction().begin();
		
		em.remove(collage);
		result="Collage is remove";
		em.getTransaction().commit();
		}
		
		return result;
	}

	
}
