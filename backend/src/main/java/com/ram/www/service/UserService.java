package com.ram.www.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.www.model.User;
import com.ram.www.repo.UserRepository;

@Service
public class UserService 
{
	@Autowired
	UserRepository userRepository;
	
	public boolean login(String username,String password)
	{
		User user = userRepository.findByUsername(username);
		
		if(user==null) return false;
		
		return user.getPassword().equals(password);
		
	}
	
}
