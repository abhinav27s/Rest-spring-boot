package com.springboot.SpringBootRest.services;

import java.util.List;

import com.springboot.SpringBootRest.entities.Course;

public interface CourseService {

	public List<Course> getCourses();
	public Course getCourse(long id);
	public Course addCourse(Course c);
	public String updateCourse(long id, Course c);
	public String deleteCourse(long id);
}
