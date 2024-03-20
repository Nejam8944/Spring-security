package com.security.service;

import java.util.List;

import com.security.entity.User;

public interface UserService {

	User saveUser(User user);

	List<User> getAllUser();

	User getUser(String userId);
}
