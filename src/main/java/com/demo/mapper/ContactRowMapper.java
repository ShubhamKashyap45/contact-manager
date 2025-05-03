package com.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.beans.Contacts;

public class ContactRowMapper implements RowMapper<Contacts>{

	@Override
	public Contacts mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Contacts c = new Contacts();
		c.setCid(rs.getInt(1));
		c.setPhoneno(rs.getLong(2));
		c.setEmail(rs.getString(3));
		c.setUserId(rs.getInt(4));
		return c;
	}

}
