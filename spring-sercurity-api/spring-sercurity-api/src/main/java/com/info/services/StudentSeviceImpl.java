package com.info.services;

import org.springframework.stereotype.Service;

import com.info.dao.StudentRepo;
import com.info.entity.StudentData;

@Service
public class StudentSeviceImpl implements StudentSevice {

	private StudentRepo studentRepo;
	
	
	
	public StudentSeviceImpl(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}


	//to build save student
	
	@Override
	public StudentData saveStudent(StudentData data) {
		
		return studentRepo.save(data) ;
	}

}
