package com.demo.beans;

//This class is to store contact details saved by user in database
public class Contacts {
	
	private int cid;
	private Long phoneno;
	private String email;
	private int userId;
	
	public Contacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Contacts(int cid, Long phoneno, String email, int userId) {
		super();
		this.cid = cid;
		this.phoneno = phoneno;
		this.email = email;
		this.userId = userId;
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
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Contacts [cid=" + cid + ", phoneno=" + phoneno + ", email=" + email + ", userId=" + userId + "]";
	}
	
	

}
