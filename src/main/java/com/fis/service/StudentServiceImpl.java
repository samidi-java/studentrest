package com.fis.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fis.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	static HashMap<Integer ,Student> map=new HashMap<>();
	static
	{
		map.put(100, new Student(100,"vishnu",50));
		map.put(101, new Student(101,"gokul",60));
	}
	

	public Collection<Student> getAllStudents() {
		return map.values();
	}

	public Student getStudentById(int id) {
		return map.get(100);
	}


	public void deleteStudentById(int id) {
		map.remove(id);
	}

}
