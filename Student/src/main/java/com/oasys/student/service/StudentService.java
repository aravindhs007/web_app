package com.oasys.student.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.student.dao.StudentDao;
import com.oasys.student.entity.Student;
import com.oasys.student.exception.NameNotFoundException;


@Service
public class StudentService {
	@Autowired
	StudentDao studao;
	public List<Student> sl(List<Student> e) {
		
		return studao.sl(e);
	}
	public List<Student> getall(){
		return studao.getall();
	}
	public List<Student> getEmployeeByName(String name)throws NameNotFoundException {
		List<Student>allStu=this.getall();
		List<Student> val=allStu.stream().filter(i->i.getName().equals(name)).toList();
		if(val.isEmpty()==true) {
			throw new NameNotFoundException("There is no Data Available in the name given");
		}
		else {
			return val;
		}
	}

}
