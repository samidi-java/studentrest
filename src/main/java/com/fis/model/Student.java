package com.fis.model;

import java.io.Serializable;


public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int marks;
	public Student()
	{
		
	}
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	

}
