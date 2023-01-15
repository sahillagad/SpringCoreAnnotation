package com.masai.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Collage {

	private int collageid;
	private String collageName;
	private List<Student> list;
	
	@Autowired
	public void setCollageid(int collageid) {
		this.collageid = collageid;
	}
	
	@Autowired
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	@Autowired
	public void setList(List<Student> list) {
		this.list = list;
	}
	 
	
	public void showCollage() {
	System.out.println("collage id   : "+collageid);
	System.out.println("Collage Name : "+collageName);
	
	for(Student student:list) {
		
		System.out.println(student);
	}
		
		
	}
	
	
	
}
