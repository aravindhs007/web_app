package com.oasys.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.oasys.employee.entity.Employee;
import com.oasys.employee.service.EmployeeService;
@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService empser;
	@PostMapping(value="/add")
	public String insertEmployee(@RequestBody List<Employee> e) {
	return empser.insertEmployee(e);
	}
	@GetMapping(value="/addd/{e}")
	public Employee insertEmployees(@PathVariable int e) {
	return empser.insertEmployees(e);
	}
	@GetMapping(value="/adddd")
	public List<Employee>fa() {
		return empser.fa();
	}
	@DeleteMapping(value="/ad/{e}")
	public String uid(@PathVariable int e) {
		return empser.uid(e);
	}
	@PutMapping(value="/put")
	public String update(@RequestBody Employee e) {
		return empser.update(e);
	}
	@GetMapping(value="/getByGender/{gender}")
	public List<Employee>getEmpByGender(@PathVariable String gender) {
		return empser.getEmpByGender(gender);
	}
	@GetMapping(value="getBySalary/{salary}")
	public List<Employee>getEmpBySalary(@PathVariable int salary) {
		return empser.getEmpBySalary(salary);
	}
	@GetMapping(value="getMinAge/{age}")
	public List<Integer> getMinAgeSalary(@PathVariable int age) {
		return empser.getMinAgeSalary(age);
	}
	@GetMapping(value="getMaxSalary/{salary}")
	public List<Integer>getMaxSalaryName(@PathVariable int salary) {
		return empser.getMaxSalaryName(salary);
	}
	@GetMapping(value="/getMaxName")
	public String getMaxAgeSalary(@RequestBody List<Employee> name) {
		return empser.getMaxAgeSalary(name);
	}		
	@GetMapping(value="/salaryIncrement/{gender}")
	public List<Employee> getSalIncrement(@PathVariable String gender) {
		return empser.getSalIncrement(gender);
	}
	@GetMapping(value="belowAge/{age}")
	public List<String> getBelowAge(@PathVariable int age) {
		return empser.getBelowAge(age);
	}
	
}
