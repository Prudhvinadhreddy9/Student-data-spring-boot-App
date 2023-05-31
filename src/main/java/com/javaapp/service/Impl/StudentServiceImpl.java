package com.javaapp.service.Impl;

import java.lang.*;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javaapp.entity.Student;
import com.javaapp.repository.StudentRepository;
import com.javaapp.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	private StudentRepository studentRepository;
	
	
	
	
	public StudentServiceImpl(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getallStudents() {
		
		 return studentRepository.findAll();
		
	}


	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		
		return  studentRepository.save(student);
		
	}
	
	
	
	

}
