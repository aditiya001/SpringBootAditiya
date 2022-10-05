package com.example.aditbcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="prog_stud", schema="hr")
public class StudyProgram {
	@Id
	@Column (name="kode_ps")
	private Integer kodePS;
	
	@Column (name="nama_ps")
	private String namePS;
	
	public Integer getKodePS() {
		return kodePS;
	}

	public void setKodePS(Integer kodePS) {
		this.kodePS = kodePS;
	}

	public String getNamePS() {
		return namePS;
	}

	public void setNamePS(String namePS) {
		this.namePS = namePS;
	}

	
}
