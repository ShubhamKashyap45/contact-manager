package com.demo.beans;

// This class in used for Registration purpose
public class UserDetails {
	
	private int rid;
	private String name;
	private int age;
	private String gender;
	private Long userphone;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(int rid, String name, int age, String gender, Long userphone) {
		super();
		this.rid = rid;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.userphone = userphone;
	}
	
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Long getUserphone() {
		return userphone;
	}
	public void setUserphone(Long userphone) {
		this.userphone = userphone;
	}
	@Override
	public String toString() {
		return "UserDetails [rid=" + rid + ", name=" + name + ", age=" + age + ", gender=" + gender + ", userphone="
				+ userphone + "]";
	}
	
	
	

}
