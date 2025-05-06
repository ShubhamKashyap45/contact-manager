package com.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.beans.MyUser;

public class FindUserByIdRowMapper implements RowMapper<MyUser> {

	@Override
	public MyUser mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		MyUser u = new MyUser();
		u.setUid(rs.getInt(1));
		u.setUsername(rs.getString(2));
		u.setPassword(rs.getString(3));
		u.setRole(rs.getString(4));
		return u;
	}

}
