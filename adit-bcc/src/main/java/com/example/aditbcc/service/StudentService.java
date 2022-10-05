package com.example.aditbcc.service;

import java.util.List;
import java.util.Optional;

import com.example.aditbcc.dto.ScoreDTO;
import com.example.aditbcc.dto.StudentDTO;
import com.example.aditbcc.model.Score;
import com.example.aditbcc.model.Student;

public interface StudentService {
	public List<Student>getAllStudent();
	
	public String addStudent(Student student);
	
	public String addPass(Student student);
	
	public String updatePass(Student student);
	
	public String kodeUnik(String nim);
	
	public List<Student> searchName(String key);
	
	public StudentDTO setData(String nim);
	
	
}
