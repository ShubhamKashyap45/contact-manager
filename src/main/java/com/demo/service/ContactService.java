package com.demo.service;

import java.util.List;

import com.demo.beans.Contacts;

public interface ContactService {

	List<Contacts> getAllContacts();

	boolean addNewContact(Contacts c);

	boolean updateContact(Contacts c);

	Contacts getById(int cid);

	boolean deleteById(int cid);

}
