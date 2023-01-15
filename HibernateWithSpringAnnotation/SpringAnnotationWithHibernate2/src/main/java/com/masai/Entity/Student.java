package com.masai.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roll;
	private String name;
	private int marks;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Collage collage;

	public Student(int roll, String name, int marks, Collage collage) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.collage = collage;
	}

	public Student(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public Student(String name, int marks, Collage collage) {
		super();
		this.name = name;
		this.marks = marks;
		this.collage = collage;
	}

	public Student() {
		super();
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Collage getCollage() {
		return collage;
	}

	public void setCollage(Collage collage) {
		this.collage = collage;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", collage=" + collage + "]";
	}
	
	
	
	
}
