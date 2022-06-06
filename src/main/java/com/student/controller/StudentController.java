package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.StudentEntity;
import com.student.service.IStudentService;

@RestController
public class StudentController {
	@Autowired
	IStudentService studentService;
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
	public String helloWorld() {
		return "hello World";
	}
	
	@PostMapping("/student")
	public Integer createStudent(@RequestBody StudentEntity student) {
		Integer id = studentService.saveStudent(student);
		System.out.println(id);
		return id;
		
	}

}
