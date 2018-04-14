package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
public class SignUp {
	
	@Autowired
	private UserService userService;
	@RequestMapping(value=("/register") ,method = RequestMethod.POST)
	public String signUp(@RequestBody User user) {
		if(user.getCountry()!=null||user.getEmail()!=null||user.getFullName()!=null||user.getMobile()!=null||user.getPassword()!=null)
			return userService.insertData(user);
		else
			return "insufficent data";
	}
}
