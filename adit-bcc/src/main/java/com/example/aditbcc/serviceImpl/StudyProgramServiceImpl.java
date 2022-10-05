package com.example.aditbcc.serviceImpl;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.example.aditbcc.model.StudyProgram;
import com.example.aditbcc.repository.StudyProgramRepository;
import com.example.aditbcc.service.StudyProgramService;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class StudyProgramServiceImpl implements StudyProgramService{

	@Autowired
	StudyProgramRepository studyProgramRepository;
	
	@Override
	public List<StudyProgram> getAllStudyProgram() {
		
		return studyProgramRepository.findAll();
	}

	@Override
	public String addStudyProgram(StudyProgram studyProgram) {
		String result = "Add Study Program Failed";
		if(studyProgram != null) {
			studyProgramRepository.save(studyProgram);
			result = "Add Study Program Success";
		}
		return result;
	}

	@Override
	public String updateStudyProgram(StudyProgram studyProgram) {
		String result = "Update Study Program Failed";
		if(studyProgram != null) {
			Optional<StudyProgram> exStudyProgram = studyProgramRepository.findById(studyProgram.getKodePS());
			if(exStudyProgram.isPresent()) {
				studyProgramRepository.save(studyProgram);
			}
			result = "Update Study Program Success";
		}
		return result;
	}

	@Override
	public String deleteStudyProgram(Integer id) {
		String result = "Delete Study Program Failed";
		Optional<StudyProgram> exStudyProgram = studyProgramRepository.findById(id);
		if(exStudyProgram.isPresent()) {
			studyProgramRepository.deleteById(id);
			result = "Delete Study Program Success";
		}
		return result;
	}

	@Override
	public byte[] exportReport() throws JRException, IOException {
		InputStream filePathReport = new ClassPathResource("templates/Blank_A4.jrxml").getInputStream();
		
		List<StudyProgram> studyProgram = getAllStudyProgram();
		
		JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(studyProgram);
		
		JasperReport report = JasperCompileManager.compileReport(filePathReport);
		
		final Map<String, Object> parameters = new HashMap<>();
		parameters.put("createdBy", "Aditiya");
		
		JasperPrint print = JasperFillManager.fillReport(report, parameters, ds);
		
		byte[] byteArr = JasperExportManager.exportReportToPdf(print);
		
		return byteArr;
	}

}
