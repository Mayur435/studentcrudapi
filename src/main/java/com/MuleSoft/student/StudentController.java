package com.MuleSoft.student;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@RequestMapping("/student")
	public List<Student> getStudents(){
		return studentService.getStudents();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "student")
	public String addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
		return "Student added Succcessfully !!!";
	}
	
	@RequestMapping("student/{id}")
	public Optional<Student> getStudent(@PathVariable String id)
	{
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "student/{id}")
	public String updateStudent(@RequestBody Student student, @PathVariable String id)
	{
		studentService.updateStudent(id, student);
		
		return "Updated Successfully !!!";
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "student/{id}")
	public String updateStudent(@PathVariable String id)
	{
		studentService.deleteStudent(id);
		
		return "Deleted Successfully !!!";
	}
}
