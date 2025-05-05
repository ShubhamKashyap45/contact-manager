package com.demo.dao;

import java.util.List;

import com.demo.beans.MyUser;

public interface AdminDao {

	List<MyUser> findAllUsers();

}
