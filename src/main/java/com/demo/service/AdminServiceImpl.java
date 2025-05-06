package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.MyUser;
import com.demo.dao.AdminDao;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao adao;

	@Override
	public List<MyUser> getAllUsers() {
		// TODO Auto-generated method stub
		return adao.findAllUsers();
	}

	@Override
	public MyUser getById(int uid) {
		// TODO Auto-generated method stub
		return adao.findById(uid);
	}

	@Override
	public boolean updateUser(MyUser u) {
		// TODO Auto-generated method stub
		return adao.modifyUser(u);
	}

}
