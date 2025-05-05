package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;
import com.demo.mapper.AdminRowMapper;

@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<MyUser> findAllUsers() {
		// TODO Auto-generated method stub
		String sql = "select * from users";
		return jdbcTemplate.query(sql, new AdminRowMapper());
	}

}
