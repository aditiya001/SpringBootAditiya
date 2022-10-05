package com.example.aditbcc.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mahasiswa", schema="hr")
public class Student {
	@Id
	@Column(name="nim")
	private String nim;
	
	@Column(name="nama")
	private String nama;
	
	@Column(name="tgl_lhr")
	private Date tglLahir;
	
	@Column(name="alamat")
	private String alamat;
	
	@Column(name="jns_kelamin")
	private String jenisKelamin;
	
	@Column(name="kode_ps")
	private Integer kodePS;
	
	@Column(name="password")
	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

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

	public void setTglLahir(Date tglLahir) {
		this.tglLahir = tglLahir;
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
}
