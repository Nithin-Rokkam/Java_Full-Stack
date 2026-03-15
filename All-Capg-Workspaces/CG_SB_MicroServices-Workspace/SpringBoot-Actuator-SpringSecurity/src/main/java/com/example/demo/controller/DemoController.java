package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	 @Autowired
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
}
