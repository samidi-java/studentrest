package com.fis.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fis.model.Student;
import com.fis.service.StudentServiceImpl;

@RestController
public class StudentController {
	@Autowired
	private StudentServiceImpl service;
	
	@GetMapping("/student")
	public Collection<Student> getAllStudents()
	{
		return service.getAllStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student getStudentById(@PathVariable("id") int id)
	{
		return service.getStudentById(id);
	}
	
	
	@DeleteMapping("/student/delete/{id}")
	public void deleteStudentById(@PathVariable("id") int id)
	{
		service.deleteStudentById(id);
	}
	
	@GetMapping("/hello")
	public String message()
	{
		return "Hello world";
	}

}
