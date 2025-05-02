package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@SuppressWarnings("deprecation")
	@Override
	public MyUser validateUser(String unm, String pass) {
		// TODO Auto-generated method stub
		try {
			return jdbcTemplate.queryForObject("select uid, username, password, role from users where username=? and password=?", 
					new Object[] {unm,pass}, BeanPropertyRowMapper.newInstance(MyUser.class));
		} catch(EmptyResultDataAccessException e) {
			System.out.println("User Not found");
		}
		return null;
	}

}
