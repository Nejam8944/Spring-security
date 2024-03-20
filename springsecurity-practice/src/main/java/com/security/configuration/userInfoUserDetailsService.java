package com.security.configuration;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.entity.User;
import com.security.repository.UserRepository;
@Service
public class userInfoUserDetailsService implements UserDetailsService {
	@Autowired
	UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> opt =  repo.findById(username);
		return opt.map(UserInfoUserDetails::new)
				  .orElseThrow(()-> new UsernameNotFoundException("username "+username+" not found") );
	}

}
