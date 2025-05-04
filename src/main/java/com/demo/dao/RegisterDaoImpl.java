package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.UserDetails;

@Repository
public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean saveUser(UserDetails ud) {
		// TODO Auto-generated method stub
		String sql = "insert into user_details(name, age, gender,userphone) values (?,?,?,?)";
		int n = jdbcTemplate.update(sql, new Object[] {ud.getName(), ud.getAge(), ud.getGender(), ud.getUserphone()});
		return n>0;
	}

}
