package com.demo.beans;

public class Contacts {
	
	private int cid;
	private Long phoneno;
	private String email;
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contacts(int cid, long phoneno, String email) {
		super();
		this.cid = cid;
		this.phoneno = phoneno;
		this.email = email;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contacts [cid=" + cid + ", phoneno=" + phoneno + ", email=" + email + "]";
	}
	
	

}
