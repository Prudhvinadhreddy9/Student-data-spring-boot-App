package com.javaapp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.javaapp.entity.Student;
import com.javaapp.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;


	
	//handler method to handle list of Students and return mode and view
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		
		model.addAttribute("students", studentService.getallStudents())	;
		
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		
		//create student object to hold student form data
		
		Student student = new Student();
		model.addAttribute("student", student);
		
		return "create_student";
		
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		
		studentService.saveStudent(student);
		
		return "redirect:/students";
	}
	
}
