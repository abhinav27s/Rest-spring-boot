package com.springboot.SpringBootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpringBootRest.entities.Course;
import com.springboot.SpringBootRest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/courses/home")
	public String home(){
		return "Welcome to home. This API has basic CRUD operations";
	}
	
	@GetMapping("/courses")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	@GetMapping("/courses/{id}")
	public Course getCourseByID(@PathVariable String id) {
		return courseService.getCourse(Long.parseLong(id));
	}
	
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course c) {
		return courseService.addCourse(c);
	}
	
	@PutMapping("/courses/{id}")
	public String updateCourse(@PathVariable String id, @RequestBody Course c) {
		return courseService.updateCourse(Long.parseLong(id),c);
	}
	
	@DeleteMapping("/courses/{id}")
	public String deleteCourse(@PathVariable String id) {
		return courseService.deleteCourse(Long.parseLong(id));
	}
}
