package com.devops.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.devops.model.Student;

@Service
public class StudentService {
	
	private static final Logger log = LogManager.getLogger(StudentService.class);
	
	
	public Student getAllStudent() {
		
		
		Student s=new Student("ripon","serizul islam","rina begum");
		
		return s;
	}
	

	

}
