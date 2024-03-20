package com.security.serviceimpl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.entity.User;
import com.security.repository.UserRepository;
import com.security.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository repo;
	
	@Override
	public User saveUser(User user) {
		
		String uuid = UUID.randomUUID().toString().substring(0, 8);
		user.setUserId(uuid);
		repo.save(user);
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> list = repo.findAll();
		if(list==null || list.isEmpty())
			throw new RuntimeException("list is empty");
		return list;
	}

	@Override
	public User getUser(String userId) {
		Optional<User> opt = repo.findById(userId);
		if(opt.get()==null)
			throw new RuntimeException("user not found ");
		return opt.get();
	}

}
