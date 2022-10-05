package com.example.aditbcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aditbcc.model.Score;
import com.example.aditbcc.service.ScoreService;

@RestController
@RequestMapping("/api/score")
public class ScoreController {

	@Autowired
	ScoreService scoreService;
	
	@GetMapping
	public List<Score>getAllScore(){
		return scoreService.getAllScore();
	}
	
	@PostMapping("/addScores")
	public String addScore(@RequestBody Score score) {
		return scoreService.addScore(score);
	}
}
