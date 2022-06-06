package com.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;

@Service
public class StudentServiceImpl implements IStudentService {
     @Autowired
	IStudentRepository studentRepository;
	@Override
	public Integer saveStudent(StudentEntity student) {
		StudentEntity savedStudent = studentRepository.save(student);
		return savedStudent.getId();
	}

}
