package com.nabin.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring Framework","Sring"),
			new Topic("java","java EE Framework","java"),
			new Topic("hibernate","hibernate Framework","hibernate")
			
			);
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

}
