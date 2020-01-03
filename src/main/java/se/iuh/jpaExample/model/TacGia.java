package se.iuh.jpaExample.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Entity
@Table(name = "TACGIA")
public class TacGia implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "MATACGIA")
	private String ma;
	@Column(name = "HOTEN")
	private String hoten;
	@Column(name = "LINHVUC")
	private String linhvuc;
	@Column(name = "TIEUSU")
	private String tieusu;
	@OneToMany(mappedBy = "tacGia", fetch = FetchType.EAGER)
	private List<TacPham> dstp;
	public TacGia() {};
	public TacGia(String ma, String hoten, String linhvuc, String tieusu) {
		super();
		this.ma = ma;
		this.hoten = hoten;
		this.linhvuc = linhvuc;
		this.tieusu = tieusu;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getLinhvuc() {
		return linhvuc;
	}

	public void setLinhvuc(String linhvuc) {
		this.linhvuc = linhvuc;
	}

	public String getTieusu() {
		return tieusu;
	}

	public void setTieusu(String tieusu) {
		this.tieusu = tieusu;
	}

	public List<TacPham> getDstp() {
		return dstp;
	}

	public void setDstp(List<TacPham> dstp) {
		this.dstp = dstp;
	}

	@Override
	public String toString() {
		return ma;
	}
	
}
