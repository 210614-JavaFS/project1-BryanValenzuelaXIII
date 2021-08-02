package com.revature.repos;

import java.util.List;

import com.revature.models.User;


public interface UserDao {
	
	public List<User> finaAllUser();
	public User findByUsernameEmployee(int id);
}
