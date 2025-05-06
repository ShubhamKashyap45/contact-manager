package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;
import com.demo.mapper.AdminRowMapper;
import com.demo.mapper.FindUserByIdRowMapper;

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

	@SuppressWarnings("deprecation")
	@Override
	public MyUser findById(int uid) {
		// TODO Auto-generated method stub
		try {
			String sql = "select * from users where uid=?";
			return jdbcTemplate.queryForObject(sql, new Object[] {uid}, new FindUserByIdRowMapper());
		} catch (EmptyResultDataAccessException e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public boolean modifyUser(MyUser u) {
		// TODO Auto-generated method stub
		String sql = "update users set username=?, password=?, role=? where uid=?";
		int n = jdbcTemplate.update(sql, new Object[] {u.getUsername(), u.getPassword(), u.getRole(), u.getUid()});
		return n>0;
	}

	@Override
	public boolean removeById(int uid) {
		// TODO Auto-generated method stub
		String sql = "delete from users where uid=?";
		int n = jdbcTemplate.update(sql, new Object[] {uid});
		return n>0;
	}
}
