package com.demo.beans;

public class MyUser {
	private int uid;
	private String username;
	private String password;
	private String role;
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MyUser(int uid, String username, String password, String role) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.role = role;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}
	
	

}
