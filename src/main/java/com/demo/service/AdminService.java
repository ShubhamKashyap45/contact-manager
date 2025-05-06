package com.demo.service;

import java.util.List;

import com.demo.beans.MyUser;

public interface AdminService {

	List<MyUser> getAllUsers();

	MyUser getById(int uid);

	boolean updateUser(MyUser u);

	boolean deleteById(int uid);

}
