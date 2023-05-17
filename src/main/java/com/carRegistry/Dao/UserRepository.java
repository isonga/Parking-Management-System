package com.carRegistry.Dao;


import com.carRegistry.model.User;

public interface UserRepository {
	
	public int save(User user);
	
	public User get(String email);
	
}
