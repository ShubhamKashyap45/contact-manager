package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.UserDetails;
import com.demo.dao.RegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	RegisterDao rdao;

	@Override
	public boolean addNewUser(UserDetails ud) {
		// TODO Auto-generated method stub
		return rdao.saveUser(ud);
	}

}
