package com.ram.www.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ram.www.service.UserService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/user")
public class UserController 
{
	@Autowired
	UserService userService;
	
	@PostMapping("/login")
	public boolean login(@RequestBody Map<String, String>data)
	{
		return userService.login(data.get("username"),data.get("password"));
	}
}
