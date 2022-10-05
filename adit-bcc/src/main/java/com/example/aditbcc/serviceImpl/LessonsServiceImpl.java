package com.example.aditbcc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aditbcc.model.Lessons;
import com.example.aditbcc.repository.LessonsRepository;
import com.example.aditbcc.service.LessonsService;

@Service
public class LessonsServiceImpl implements LessonsService{
	
	@Autowired
	LessonsRepository lessonsRepository;
	
	@Override
	public List<Lessons> getAllLessons() {
		return lessonsRepository.findAll();
	}

	@Override
	public String addLessons(Lessons lessons) {
		String result = "Add Lessons Failed";
		if(lessons != null) {
			lessonsRepository.save(lessons);
			result = "Add Lessons Success";
		}
		return result;
	}
	

}
