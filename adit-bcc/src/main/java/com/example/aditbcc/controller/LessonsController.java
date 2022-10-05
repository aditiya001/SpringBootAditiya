package com.example.aditbcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aditbcc.model.Lessons;
import com.example.aditbcc.service.LessonsService;

@RestController
@RequestMapping("/api/lessons")
public class LessonsController {
	
	@Autowired
	LessonsService lessonsService;
	
	@GetMapping
	public List<Lessons>getAllLessons(){
		return lessonsService.getAllLessons();
	}
	
	@PostMapping("/addLessons")
	public String addLessons(@RequestBody Lessons lessons) {
		return lessonsService.addLessons(lessons);
	}
	
	
}
