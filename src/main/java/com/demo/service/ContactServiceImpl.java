package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.beans.Contacts;
import com.demo.dao.ContactDao;

@Service
public class ContactServiceImpl implements ContactService {
	@Autowired
	ContactDao cdao;

	@Override
	public List<Contacts> getAllContacts() {
		// TODO Auto-generated method stub
		return cdao.findAllContacts();
	}

	@Override
	public boolean addNewContact(Contacts c) {
		// TODO Auto-generated method stub
		return cdao.saveContact(c);
	}

	@Override
	public boolean updateContact(Contacts c) {
		// TODO Auto-generated method stub
		return cdao.modifyContact(c);
	}

	@Override
	public Contacts getById(int cid) {
		// TODO Auto-generated method stub
		return cdao.findById(cid);
	}

	@Override
	public boolean deleteById(int cid) {
		// TODO Auto-generated method stub
		return cdao.removeById(cid);
	}

}
