package com.example.aditbcc.dto;

import java.sql.Date;
import java.util.List;

public class StudentDTO {
	private String nim;
	private String nama;
	private Date tglLahir;
	private String alamat;
	private String jenisKelamin;
	private Integer kodePS;
	private String password;
	public List<ScoreDTO> scoreDTO;
	
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Date getTglLahir() {
		return tglLahir;
	}
	public void setTglLahir(Date date) {
		this.tglLahir = date;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public String getJenisKelamin() {
		return jenisKelamin;
	}
	public void setJenisKelamin(String jenisKelamin) {
		this.jenisKelamin = jenisKelamin;
	}
	public Integer getKodePS() {
		return kodePS;
	}
	public void setKodePS(Integer kodePS) {
		this.kodePS = kodePS;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<ScoreDTO> getScoreDTO() {
		return scoreDTO;
	}
	public void setScoreDTO(List<ScoreDTO> scoreDTO) {
		this.scoreDTO = scoreDTO;
	}
}
