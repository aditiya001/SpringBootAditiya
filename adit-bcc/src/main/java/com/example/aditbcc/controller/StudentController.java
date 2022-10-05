package com.example.aditbcc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aditbcc.dto.StudentDTO;
import com.example.aditbcc.model.Student;
import com.example.aditbcc.service.StudentService;

@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping
	public List<Student>getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
	}
	
	@PostMapping("/addPass")
	public String addPass(@RequestBody Student student) {
		return studentService.addPass(student);
	}
	@PutMapping("/updatePass")
	public String updatePass (@RequestBody Student student) {
		return studentService.updatePass(student);
	}
	
	@PostMapping("/generateKode")
	public String kodeUnik(@RequestBody String nim) {
		return studentService.kodeUnik(nim);
	}
	
	@GetMapping("/searchMhs/{key}")
	public List<Student> searchName(@PathVariable String key){
		return studentService.searchName(key);
	}
	
	@PostMapping("/searchMhsData")
	public StudentDTO setData(@RequestBody String nim) {
		return studentService.setData(nim);
	}
}
