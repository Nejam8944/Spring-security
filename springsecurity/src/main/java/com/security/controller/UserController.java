package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.User;
import com.security.serviceimpl.UserServiceImpl;



@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserServiceImpl service;
	
	@PostMapping("/post")
	public User addUser(@RequestBody User user) {
		service.saveUser(user);
		return user;
	}
	
	@GetMapping("/all")
	public List<User> getMethodName() {
		return service.getAllUser();
	}
	
	@GetMapping("/get/{id}")
	public User getMethodName(@PathVariable String id) {
		return service.getUser(id);
	}
	
	
}
