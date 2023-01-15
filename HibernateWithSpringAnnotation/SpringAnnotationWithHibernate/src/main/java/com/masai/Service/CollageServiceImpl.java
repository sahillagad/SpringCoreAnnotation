package com.masai.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Dao.CollageDao;
import com.masai.Dao.StudentDao;
import com.masai.Entity.Collage;
import com.masai.Entity.Student;

@Service
public class CollageServiceImpl implements CollageService{

	
	@Autowired
	private CollageDao collageDao;

	@Override
	public String addCollage(Collage c) {
		
		String result=collageDao.addCollage(c);
		
		System.out.println(result);
		return result;
	}

	@Override
	public String updateCollage(Collage c) {
	String result=collageDao.updateCollage(c);
		
		System.out.println(result);
		return result;
	}

	@Override
	public List<Collage> listPersons() {
	 
		List<Collage> collages=collageDao.listPersons();
		
		for(Collage collage:collages) {
			
			System.out.println("College Id   : "+collage.getCollageId());
			System.out.println("College Name : "+collage.getCollageName());
			List<Student> list= collage.getStudents();
			for(Student student: list) {
				System.out.println("Roll  : "+student.getRoll());
				System.out.println("Name  : "+student.getName());
				System.out.println("Marks : "+student.getMarks());
				
			}
			
		}
		
		return collages;
 	}

	@Override
	public Collage getStudentById(int id) {
		
	 Collage  collage=collageDao.getStudentById(id);
	 
	 System.out.println("College Id   : "+collage.getCollageId());
		System.out.println("College Name : "+collage.getCollageName());
		System.out.println("==================*******====================");
		List<Student> list= collage.getStudents();
		for(Student student: list) {
			System.out.println("Roll  : "+student.getRoll());
			System.out.println("Name  : "+student.getName());
			System.out.println("Marks : "+student.getMarks());
			
		}
	 
	 
		return collage;
	}

	@Override
	public String removeCollage(int id) {
	
		
		String result=collageDao.removeCollage(id);
		System.out.println(result);
		return result;
		
	}
	
	
	
	
}
