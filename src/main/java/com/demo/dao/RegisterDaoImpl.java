package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.MyUser;
import com.demo.beans.UserDetails;

@Repository
public class RegisterDaoImpl implements RegisterDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public boolean saveUser(UserDetails ud, MyUser user) {
		// TODO Auto-generated method stub
		String sql1 = "insert into user_details(name, age, gender,userphone) values (?,?,?,?)";
		int n1 = jdbcTemplate.update(sql1, new Object[] {ud.getName(), ud.getAge(), ud.getGender(), ud.getUserphone()});
		
		String sql2="insert into users(username,password,role) values(?,?,?)";
		int n2 = jdbcTemplate.update(sql2, new Object[] {user.getUsername(), user.getPassword(), user.getRole()});
		return (n1>0 && n2>0);
	}

}
