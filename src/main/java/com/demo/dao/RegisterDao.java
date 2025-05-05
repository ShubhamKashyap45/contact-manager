package com.demo.dao;

import com.demo.beans.MyUser;
import com.demo.beans.UserDetails;

public interface RegisterDao {

	boolean saveUser(UserDetails ud, MyUser user);

}
