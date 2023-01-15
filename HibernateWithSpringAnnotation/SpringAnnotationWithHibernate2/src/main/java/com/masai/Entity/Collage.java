package com.masai.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Collage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int collageId;
	private String collageName;
	private String address;
	
	
	
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	List<Student> students=new ArrayList<Student>();

	
	public Collage() {
		super();
	}

	public Collage(String collageName, String address) {
		super();
		this.collageName = collageName;
		this.address = address;
	}

	public Collage(String collageName, String address, List<Student> students) {
		super();
		this.collageName = collageName;
		this.address = address;
		this.students = students;
	}

	public Collage(int collageId, String collageName, String address) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.address = address;
	}

	public Collage(int collageId, String collageName, String address, List<Student> students) {
		super();
		this.collageId = collageId;
		this.collageName = collageName;
		this.address = address;
		this.students = students;
	}


	public int getCollageId() {
		return collageId;
	}

	public void setCollageId(int collageId) {
		this.collageId = collageId;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Collage [collageId=" + collageId + ", collageName=" + collageName + ", address=" + address
				+ ", students=" + students + "]";
	}
	
	
	
}
