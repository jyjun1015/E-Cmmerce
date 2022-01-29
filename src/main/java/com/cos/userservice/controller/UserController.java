package com.cos.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.userservice.vo.Greeting;

@RestController
@RequestMapping("/") // prefix
public class UserController {
	
	
	private Environment env;
	
	@Autowired
	private Greeting greeting;
	
	
	@Autowired
	public UserController(Environment env) {
		this.env = env;
	}

	@GetMapping("/welcome")
	public String welcome() {
		return env.getProperty("greeting.message");
	}
	
	@GetMapping("/health_check")
	public String status() {
//		return "It's working in User Service";
		return greeting.getMessage();
	}
	
	
}
