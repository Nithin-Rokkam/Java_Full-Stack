package com.capg.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springboot.entity.CapgTopics;

@Service
public class CapgTopicsService {
	
	
	List<CapgTopics> list = new ArrayList<>();

	public List<CapgTopics> getAllTopics() {
		return list;
	}

	public void addTopic(CapgTopics topic) {
		list.add(topic);
	}

}
