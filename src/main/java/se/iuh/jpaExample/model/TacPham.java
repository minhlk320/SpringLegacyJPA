package se.iuh.jpaExample.model;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TACPHAM")
public class TacPham {
	@Id
	@Column(name = "MATP")
	private String ma;
	@Column(name = "TENTP")
	private String ten;
	@Column(name = "SOTRANG")
	private int sotrang;
	@Column(name = "GIA")
	private double gia;
	@Column(name = "TOMTAT")
	private String tomtat;
	@Column(name = "HINH", length = 80000)
	private byte[] hinh;
	@ManyToOne
	@JoinColumn(name = "MATACGIA")
	private TacGia tacGia;
	
	public TacPham() {
		super();
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSotrang() {
		return sotrang;
	}
	public void setSotrang(int sotrang) {
		this.sotrang = sotrang;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public String getTomtat() {
		return tomtat;
	}
	public void setTomtat(String tomtat) {
		this.tomtat = tomtat;
	}
	public String getHinh() throws IOException {
		String encoded = Base64.getEncoder().encodeToString(hinh);
		return encoded;
	}
	public void setHinh(byte[] hinh) {
		this.hinh = hinh;
	}
	public TacGia getTacGia() {
		return tacGia;
	}
	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}
	public TacPham(String ma, String ten, int sotrang, double gia, String tomtat, byte[] hinh, TacGia tacGia) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.sotrang = sotrang;
		this.gia = gia;
		this.tomtat = tomtat;
		this.hinh = hinh;
		this.tacGia = tacGia;
	}
	@Override
	public String toString() {
		return "TacPham [ma=" + ma + ", ten=" + ten + ", sotrang=" + sotrang + ", gia=" + gia + ", tomtat=" + tomtat
				+ ", tacGia=" + tacGia + "]";
	}
	
}
