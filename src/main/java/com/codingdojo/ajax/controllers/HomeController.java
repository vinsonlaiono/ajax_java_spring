package com.codingdojo.ajax.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.ajax.models.User;
import com.codingdojo.ajax.services.UserService;

@RestController
@RequestMapping("/api")
public class HomeController {
	private final UserService us;
	
	public HomeController(UserService us) {
		this.us = us;
	}

	@GetMapping("/users")
	public List<User> root() {
		List<User> allUsers = us.findAllUsers();
		System.out.println(allUsers);
		return allUsers;
	}

	@GetMapping("/users/{id}")
	public User oneUser(@PathVariable("id") Long id) {
		System.out.println(id);
		User user = us.findOneUser(id);
		System.out.println(user);
		return user;
	}
}
