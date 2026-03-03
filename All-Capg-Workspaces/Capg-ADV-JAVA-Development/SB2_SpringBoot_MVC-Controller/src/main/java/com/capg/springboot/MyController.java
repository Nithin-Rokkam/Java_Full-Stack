package com.capg.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@RequestMapping("login.spring")
	public String loginValid() {
		return "Welcome to Spring Boot MVC Controller";
	}
	
	@RequestMapping("user.spring")
	public String userValid() {
		return "Welcome to Spring Boot MVC Controller Hello User";
	}
}
