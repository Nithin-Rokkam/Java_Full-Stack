package com.capg.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JavaTopicsController {
	
	@Autowired
	JavaTopicService topicService;
	
	@RequestMapping("login.spring")
	public String login() {
		return "login Successful";
	}
	
	@RequestMapping("topics")
	public List getallTopics() {
		return topicService.getAllMyTopics();
	}
}
