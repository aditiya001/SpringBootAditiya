package com.example.aditbcc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aditbcc.model.Score;
import com.example.aditbcc.repository.ScoreRepository;

@Service
public class ScoreServiceImpl {
	@Autowired
	ScoreRepository scoreRepository;
	
	public List<Score>getAllScore(){
		return scoreRepository.findAll();
	}
}
