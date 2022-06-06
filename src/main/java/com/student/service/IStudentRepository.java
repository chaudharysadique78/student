package com.student.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.StudentEntity;

public interface IStudentRepository extends JpaRepository<StudentEntity, Integer>{

}
