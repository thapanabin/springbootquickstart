package com.nabin.springbootstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	
	public List<Course> getAllCourses(String topicId) {

		List<Course> courses = new ArrayList<Course>();
		//every elemet get by findall method add to the topics list
		courseRepository.findByTopicId(topicId).forEach(courses :: add);
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
		
	}
	
//	public void deleteTopic(String id) {
//		for (int i = 0; i < topics.size(); i++) {
//			Topic t = topics.get(i);
//			if (t.getId().equals(id)) {
//				topics.remove(i);
//			}
//		}
//	}

}
