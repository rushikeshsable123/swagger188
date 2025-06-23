package com.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Student;
import com.repo.Studentrepository;
import com.service.Studentservicei;

@Service
public class StudentserviceIMPL implements Studentservicei {

	@Autowired
	 Studentrepository sr;
	
	@Override
	public Student saveStudent(Student student) {

		Student student2 =sr.save(student);
		return student2;
	}

}
