package com.demo.dao;

import java.util.List;

import com.demo.beans.MyUser;

public interface AdminDao {

	List<MyUser> findAllUsers();

	MyUser findById(int uid);

	boolean modifyUser(MyUser u);

}
