package com.nabin.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring","Spring Framework","Sring"),
			new Topic("Spring","Spring Framework","Sring"),
			new Topic("Spring","Spring Framework","Sring")
			
			);
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}

}
