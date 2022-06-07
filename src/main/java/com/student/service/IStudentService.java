package com.student.service;

import java.util.List;
import java.util.Optional;

import com.student.entity.StudentEntity;

public interface IStudentService {

	public Integer saveStudent(StudentEntity student);

	public List<StudentEntity> getAllStudents();

	public Optional<StudentEntity> getStudent(Integer id);
	
	public void deleteStudent(Integer id);
	
	public Integer updateStudent (StudentEntity student,Integer id);
}
