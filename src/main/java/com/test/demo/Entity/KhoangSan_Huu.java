package com.test.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="khoangsan_huu")
public class KhoangSan_Huu {
	
	@Id
	@Column(name = "masks", nullable = false)
	private String maks;
	
	private String tenKS;
	private int soLuong;
	private String tenTinh;
	private String tenMoKS_huu;
	public String getMaks() {
		return maks;
	}
	public void setMaks(String maks) {
		this.maks = maks;
	}
	public String getTenKS() {
		return tenKS;
	}
	public void setTenKS(String tenKS) {
		this.tenKS = tenKS;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public String getTenTinh() {
		return tenTinh;
	}
	public void setTenTinh(String tenTinh) {
		this.tenTinh = tenTinh;
	}
	public String getTenMoKS() {
		return tenMoKS_huu;
	}
	public void setTenMoKS(String tenMoKS) {
		this.tenMoKS_huu = tenMoKS;
	}
	public KhoangSan_Huu() {
		super();
	}
	
	
	
}
