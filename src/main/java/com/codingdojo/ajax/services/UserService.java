package com.codingdojo.ajax.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.ajax.UserRepository;
import com.codingdojo.ajax.models.User;

@Service
public class UserService {

	private final UserRepository ur;
	
	public UserService(UserRepository ur) {
		this.ur = ur;
	}
	public List<User> findAllUsers(){
		return (List<User>) ur.findAll();
	}
	public User findOneUser(Long id) {
		Optional<User> user = ur.findById(id);
		if(user.isPresent()) {
			return user.get();
		} else {
			return null;
		}
	}
}
