package com.example.aditbcc.service;

import java.util.List;

import com.example.aditbcc.model.Lessons;

public interface LessonsService {
	public List<Lessons>getAllLessons();
	
	public String addLessons(Lessons lessons);
}
