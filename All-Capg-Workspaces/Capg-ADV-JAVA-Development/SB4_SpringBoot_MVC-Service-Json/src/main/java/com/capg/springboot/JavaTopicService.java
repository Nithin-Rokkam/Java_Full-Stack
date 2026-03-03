package com.capg.springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class JavaTopicService {
	public List topics=Arrays.asList(new JavaTopics("Core Java","Core Java Description","1"),
			new JavaTopics("Advance Java","Advance Java Description","2"),
			new JavaTopics("Spring Boot","Spring Boot Description","3"));
	
	public List<JavaTopics> getAllMyTopics() {
		return topics;
	}
}
