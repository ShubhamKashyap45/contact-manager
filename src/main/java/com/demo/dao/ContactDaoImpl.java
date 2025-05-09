package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.beans.Contacts;
import com.demo.mapper.ContactRowMapper;

@Repository
public class ContactDaoImpl implements ContactDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Contacts> findAllContacts() {
		return jdbcTemplate.query("select * from contact_details", (rs, rownum) -> {
			Contacts c = new Contacts();
			c.setCid(rs.getInt(1));
			c.setName(rs.getString(2));
			c.setPhoneno(rs.getLong(3));
			c.setEmail(rs.getString(4));
			return c;
		});
	}

	@Override
	public boolean saveContact(Contacts c) {
		// TODO Auto-generated method stub
		int n = jdbcTemplate.update("insert into contact_details(name, phoneno,email,user_id) values(?,?,?,?)",
				new Object[] {c.getName(), c.getPhoneno(), c.getEmail(), c.getUserId()});
		return n>0;
	}

	@Override
	public boolean modifyContact(Contacts c) {
		// TODO Auto-generated method stub
		int n = jdbcTemplate.update("update contact_details set name=?, phoneno=?, email=? where cid=?",
				new Object[] {c.getName(), c.getPhoneno(), c.getEmail(), c.getCid()});
		return n>0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public Contacts findById(int cid) {
		// TODO Auto-generated method stub
		try {
			return jdbcTemplate.queryForObject("select * from contact_details where cid=?",
					new Object[] {cid}, (rs,rownum)->{
						Contacts c = new Contacts();
						c.setCid(rs.getInt(1));
						c.setName(rs.getString(2));
						c.setPhoneno(rs.getLong(3));
						c.setEmail(rs.getString(4));
						return c;
					});
		} catch(EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public boolean removeById(int cid) {
		// TODO Auto-generated method stub
		int n = jdbcTemplate.update("delete from contact_details where cid =?", 
				new Object[] {cid});
		return n>0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Contacts> findContactsByUser(int userId) {
		// TODO Auto-generated method stub
		String sql = "select * from contact_details where user_id=?";
		
		return jdbcTemplate.query(sql, new Object[]{userId}, new ContactRowMapper());
	}

}
