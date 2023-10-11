package com.oasys.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.student.entity.Student;
import com.oasys.student.repository.StudentRepository;
@Repository
public class StudentDao {
	@Autowired
	StudentRepository sturep;

	public List<Student> sl(List<Student>e) {
		
		return sturep.saveAll(e);
		
	}
	public List<Student> getall(){
		return sturep.findAll();
	}

}
