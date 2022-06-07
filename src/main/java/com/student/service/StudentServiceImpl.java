package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.StudentEntity;
import com.student.exception.ResourceNotFoundException;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentRepository studentRepository;

	@Override
	public Integer saveStudent(StudentEntity student) {
		StudentEntity savedStudent = studentRepository.save(student);
		return savedStudent.getId();
	}

	@Override
	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Optional<StudentEntity> getStudent(Integer id) {
		return studentRepository.findById(id);
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
	}

	@Override
	public Integer updateStudent(StudentEntity student, Integer id) {
		StudentEntity existingstudent = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
		existingstudent.setFirstname(student.getFirstname());
		existingstudent.setLastname(student.getLastname());
		studentRepository.save(existingstudent);
		return existingstudent.getId();
	}

}
