package com.masai;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Collage {

	@Autowired
	private int collageId;
	
	@Autowired
	private String collageName;
	
	@Autowired
	private List<Student> students;


	public void showCollage() {
		
		
	System.out.println("Collage Id   : "+collageId);
	System.out.println("Collage Name : "+collageName);
	
	for(Student student:students) {
		
		System.out.println(student);
	}
	
		
		
	}
	
	 

}
