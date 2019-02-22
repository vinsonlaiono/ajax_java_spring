package com.codingdojo.ajax.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsersController {

	@GetMapping("/")
	public String root() {
		return "ajax/index.jsp";
	}
}
