package com.n28minutes.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n28minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	
	@GetMapping("/course")
	public List<Course> getAllcourses() {
		return Arrays.asList(new Course(1,"Learn Mircoservices","in 28Minutes"),
				new Course(2,"Learn Full Stack with Angular and React", "in 28minutes"));
	}
	
	@GetMapping("/course/1")
	public Course getCourseDetails() {
		return new Course(1,"Learn Mircoservices","in 28Minutes");
	}
	

}
