package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.beans.UserDetails;

public interface RegisterService {

	boolean addNewUser(UserDetails ud, MyUser user);

}
