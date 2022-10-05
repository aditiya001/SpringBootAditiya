package com.example.aditbcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.aditbcc.model.Score;

public interface ScoreRepository extends JpaRepository<Score, String>{

	List<Score> findByNim(String nim);
}
