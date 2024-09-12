package com.profile.service;

import org.springframework.stereotype.Service;

import com.profile.entities.User;

@Service
public interface UserService {
	
	public  void addUser(User user);
	public boolean userExists(String username, String email);
	public boolean validateUser(String username, String password);
	
	
	
}
