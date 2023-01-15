package com.masai.Service;

import java.util.List;

import com.masai.Entity.Collage;

public interface CollageService {

	public String addCollage(Collage c);
	public String updateCollage(Collage c);
	public List<Collage> listPersons();
	public Collage getStudentById(int id);
	public String removeCollage(int id);
}
