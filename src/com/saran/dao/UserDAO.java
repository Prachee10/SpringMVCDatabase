package com.saran.dao;

import java.util.List;

import com.saran.domain.User;

public interface UserDAO {
	
	public void saveUser(User user) ;
	public List<User> listUser() ;
}
