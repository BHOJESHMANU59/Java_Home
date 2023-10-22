package com.sy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.Data;


@Entity
@Cacheable()
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Consumer 
{
	@Id
	private int cId;
	private String cName;
	private long Phno;
	@ManyToOne
	private Producer pro;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getPhno() {
		return Phno;
	}
	public void setPhno(long phno) {
		Phno = phno;
	}
	public Producer getPro() {
		return pro;
	}
	public void setPro(Producer pro) {
		this.pro = pro;
	}
	@Override
	public String toString() {
		return "Consumer [cId=" + cId + ", cName=" + cName + ", Phno=" + Phno + ", pro=" + pro + "]";
	}
	
	

}
