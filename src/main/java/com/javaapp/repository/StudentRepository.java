package com.javaapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaapp.entity.Student;

import java.lang.*;

public interface StudentRepository extends JpaRepository<Student, Long> {
	
	

}
