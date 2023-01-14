package com.masai.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {

	
	@Autowired()
	private A alpha;
	/*
	 * Here previously we write Setter injection point 
	 * to insert the dependency 
	 * but @Autowired we give than spring container at run time give setter injection point
	 * we need not write setter method 
	 * with this spring container also resolve dependency first try byname than bytype
	 * @autowrire annotation give means mendatory dependency resolve
	 * if not resolve dependency than it will throw exception
	 * here we not registered A class 
	 * than also we want if dependency not resolve than it  throw exception
	 * but here we registered A class with xml approach AND
	 * class also  Registered With stereotype annotation
	 * here it throw exception 
	 * first it try A class Object registered by name (alpha is name of our dependency variable than i will try to reslove byname any bean registered by alpha name )
	 * if not satisfied 
	 * than it will try by type than it will throw exception
	 * B class object registered two time it will not understand which one inserted
	 */
	
	
	public void funB() {
	
	     System.out.println("A class Obj : "+alpha);
		 
		
	}
	
	
	
	
}
