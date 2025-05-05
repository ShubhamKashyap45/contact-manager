package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.beans.MyUser;
import com.demo.beans.UserDetails;
import com.demo.dao.RegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	RegisterDao rdao;

	@Override
	@Transactional
	public boolean addNewUser(UserDetails ud, MyUser user) {
		// TODO Auto-generated method stub
		return rdao.saveUser(ud,user);
	}

}
