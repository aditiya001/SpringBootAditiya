package com.example.aditbcc.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.aditbcc.dto.ScoreDTO;
import com.example.aditbcc.dto.StudentDTO;
import com.example.aditbcc.model.Score;
import com.example.aditbcc.model.Student;
import com.example.aditbcc.repository.ScoreRepository;
import com.example.aditbcc.repository.StudentRepository;
import com.example.aditbcc.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	ScoreRepository scoreRepository;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public String addStudent(Student student) {
		String result = "Add Student Failed";
		if(student != null) {
			studentRepository.save(student);
			result = "Add Student Success";
		}
		return result;
	}

	@Override
	public String addPass(Student student) {
		String result = "Add Pass Failed";
		if(student != null) {
			BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
			String pass = student.getPassword();
			student.setPassword(passEncoder.encode(pass));
			studentRepository.save(student);
			result = "add pass success";
		}
		return result;
	}
    @Override
    public String updatePass(Student student) {
		String result = "Update Pass Failed";
		if(student != null) {
			BCryptPasswordEncoder passEncoder = new BCryptPasswordEncoder();
			String pass = student.getPassword();
			student.setPassword(passEncoder.encode(pass));
			studentRepository.save(student);
			result = "update pass success";
		}
		return result;
    	
    }

	@Override
	public String kodeUnik(String nim) {
		String result=nim;
		result +=result.substring(0,4);
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyy");
		String str = formatter.format(date);
		String a= result+"/"+str;
		
		int nilai;
		nilai = (int)(Math.random()*1000);
		String b =String.valueOf(nilai);
		
		int panjang = b.length();
		
		if(panjang==1) {
			b="000"+b;
		}else if(panjang==2) {
			b="00"+b;
		}else if(panjang==3) {
			b="0"+b;
		}else if(panjang==4) {
			b+=b;
		}
		
		
		String maka = a+"/"+b;
		return maka;
	}

	@Override
	public List<Student> searchName(String key) {
		return studentRepository.findByNamaContainingIgnoreCase(key);
	}

	@Override
	public StudentDTO setData(String nim) {
		Student studentData = studentRepository.findByNim(nim);
		
		List<Score> scoreData = scoreRepository.findByNim(nim);
		
		List<ScoreDTO> listScore = new ArrayList<>();
		
		StudentDTO studentDto = new StudentDTO();
		
		studentDto.setNim(studentData.getNim());
		studentDto.setNama(studentData.getNama());
		studentDto.setTglLahir(studentData.getTglLahir());
		studentDto.setAlamat(studentData.getAlamat());
		studentDto.setJenisKelamin(studentData.getJenisKelamin());
		studentDto.setKodePS(studentData.getKodePS());
		studentDto.setPassword(studentData.getPassword());
		
		for(Score scores : scoreData) {
			ScoreDTO scoreDto = new ScoreDTO();
			
			scoreDto.setScoreId(scores.getScoreId());
			scoreDto.setNim(scores.getNim());
			scoreDto.setCodePs(scores.getCodePs());
			scoreDto.setScores(scores.getScores());
			listScore.add(scoreDto);
		}
		
		studentDto.setScoreDTO(listScore);
		return studentDto;
	}

}
