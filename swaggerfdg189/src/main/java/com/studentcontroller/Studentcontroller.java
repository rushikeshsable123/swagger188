package com.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;
import com.service.Studentservicei;

@RestController
public class Studentcontroller {
	
	@Autowired
	Studentservicei ssi;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student)
	{
		Student stu =ssi.saveStudent(student);
		return stu;
		
	}

}
