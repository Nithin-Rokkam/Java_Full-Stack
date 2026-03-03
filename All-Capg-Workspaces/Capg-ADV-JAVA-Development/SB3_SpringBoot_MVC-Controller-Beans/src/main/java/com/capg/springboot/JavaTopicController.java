package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicController {
	@RequestMapping("login.spring")
	public String login() {
		return "Login Successful, Welcome to Java Topics";
	}
	
	@RequestMapping("/javaTopics")
	public List getAllTopics(){
		return Arrays.asList(
				new JavaTopics("Core Java","Core Java is the basic of Java programming language","1"),
				new JavaTopics("Advanced Java","Advanced Java is the extension of Core Java","2"),
				new JavaTopics("Spring Boot","Spring Boot is a framework for building microservices","3"),
				new JavaTopics("Spring MVC","Spring MVC is a framework for building web applications","4")
				);
	}
}
