package com.example.aditbcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Matakuliah", schema="hr")
public class Lessons {
	@Id
	@Column(name="kode_matkul")
	private String kodeMatkul;
	
	@Column(name="nama_matkul")
	private String namaMatkul;
	
	@Column(name="sks")
	private Integer sks;

	public String getKodeMatkul() {
		return kodeMatkul;
	}

	public void setKodeMatkul(String kodeMatkul) {
		this.kodeMatkul = kodeMatkul;
	}

	public String getNamaMatkul() {
		return namaMatkul;
	}

	public void setNamaMatkul(String namaMatkul) {
		this.namaMatkul = namaMatkul;
	}

	public Integer getSks() {
		return sks;
	}

	public void setSks(Integer sks) {
		this.sks = sks;
	}
}
