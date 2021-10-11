package com.devops.model;

public class Student {
	
	private String name;
	private String fatherName;
	private String motherName;
	
	public Student() {
		super();
	}
	
	
	public Student(String name, String fatherName, String motherName) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	
	
	
	

}
