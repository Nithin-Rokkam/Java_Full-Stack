package com.capg.springboot;

import java.io.Serializable;

public class JavaTopics implements Serializable {
	
	private String name;
	private String description;
	private String id;
	
	public JavaTopics() {
		super();
	}

	public JavaTopics(String topicName, String topicDescription,String id) {
		super();
		this.name = topicName;
		this.description = topicDescription;
		this.id=id;
	}

	public String getTopicName() {
		return name;
	}

	public void setTopicName(String topicName) {
		this.name = topicName;
	}

	public String getTopicDescription() {
		return description;
	}

	public void setTopicDescription(String topicDescription) {
		this.description = topicDescription;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
}
