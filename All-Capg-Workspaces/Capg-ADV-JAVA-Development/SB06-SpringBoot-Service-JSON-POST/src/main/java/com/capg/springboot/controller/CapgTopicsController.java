package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.CapgTopics;
import com.capg.springboot.service.CapgTopicsService;

@RestController
public class CapgTopicsController {
	@Autowired
	CapgTopicsService service;
	
	@RequestMapping("/MyController")
	public String display() {
		return "Welcome to Spring Boot Service JSON POST Application";
	}
	
	@RequestMapping("/capgTopics")
	public List<CapgTopics> getAllTopics(){
		return service.getAllTopics();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/capgTopics")
	public void addTopic(@RequestBody CapgTopics topic) {
		service.addTopic(topic);
	}
	
}
