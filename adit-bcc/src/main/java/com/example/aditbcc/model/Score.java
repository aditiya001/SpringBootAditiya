package com.example.aditbcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nilai", schema="hr")
public class Score {
	@Id
	@Column(name="kode_nilai")
	public String scoreId;
	
	@Column(name="nim")
	public String nim;
	
	@Column(name="kode_matkul")
	public String codePs;
	
	@Column(name="nilai")
	public Integer scores;

	public String getScoreId() {
		return scoreId;
	}

	public void setScoreId(String scoreId) {
		this.scoreId = scoreId;
	}

	public String getNim() {
		return nim;
	}

	public void setNim(String nim) {
		this.nim = nim;
	}

	public String getCodePs() {
		return codePs;
	}

	public void setCodePs(String codePs) {
		this.codePs = codePs;
	}

	public Integer getScores() {
		return scores;
	}

	public void setScores(Integer scores) {
		this.scores = scores;
	}
}
