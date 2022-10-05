package com.example.aditbcc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aditbcc.model.Score;
import com.example.aditbcc.repository.ScoreRepository;
import com.example.aditbcc.service.ScoreService;

@Service
public class ScoreServiceImpl implements ScoreService{
	@Autowired
	ScoreRepository scoreRepository;
	
	public List<Score>getAllScore(){
		return scoreRepository.findAll();
	}

	@Override
	public String addScore(Score score) {
		String result = "Add Score Failed";
		if(score != null) {
			scoreRepository.save(score);
			result = "Add Score Success";
		}
		return result;
	}
}
