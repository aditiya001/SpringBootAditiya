package com.example.aditbcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.aditbcc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String>{
	List<Student> findByNamaContainingIgnoreCase(String nama);
	
	Student findByNim(String nim);
}