package com.sy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer 
{
	@Value("111")
	private int cid;
	@Value("Srinath")
	private String cName;
	@Value("9740443341")
	private long phno;
	@Autowired
	@Qualifier("savingAccount")
	private Account account1;
	@Autowired
	@Qualifier("currentAccount")
	private Account account2;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public Account getAccount1() {
		return account1;
	}
	public void setAccount1(Account account1) {
		this.account1 = account1;
	}
	public Account getAccount2() {
		return account2;
	}
	public void setAccount2(Account account2) {
		this.account2 = account2;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cName=" + cName + ", phno=" + phno + ", account1=" + account1 + ", account2="
				+ account2 + "]";
	}
	
	

}
