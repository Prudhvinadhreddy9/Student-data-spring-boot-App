package com.javaapp.service;

import java.util.List;

import com.javaapp.entity.Student;

public interface StudentService {
	
	List<Student> getallStudents();
	
	Student saveStudent(Student student);
}
