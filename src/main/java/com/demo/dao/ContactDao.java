package com.demo.dao;

import java.util.List;

import com.demo.beans.Contacts;

public interface ContactDao {

	List<Contacts> findAllContacts();

	boolean saveContact(Contacts c);

	boolean modifyContact(Contacts c);

	Contacts findById(int cid);

	boolean removeById(int cid);

}
