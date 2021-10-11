package com.devops.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devops.model.Student;
import com.devops.service.StudentService;


@RestController
public class AppController {
	
	private static final Logger log = LogManager.getLogger(AppController.class);
	
	@Autowired StudentService  studentService;
	
	
	
	@GetMapping(value="/student/info")
	public ResponseEntity<Student> getAllStudentInfo() {
		
		return ResponseEntity.ok().body(studentService.getAllStudent());
		//return studentService.getAllStudent();
	}
	
	
	

}
