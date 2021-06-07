package com.springboot.SpringBootRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.SpringBootRest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{

	List<Course> list;
	
	public CourseServiceImpl() {
				list = new ArrayList<>();
				list.add(new Course(1,"DBMS","This is a course of Databases."));
				list.add(new Course(2,"OS","This is a course of Operating Systems."));
			}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long id) {
		// TODO Auto-generated method stub
		for(Course c:list)
			if(c.getId()==id)
				return c;
		return null;
	}

	@Override
	public Course addCourse(Course c) {
		// TODO Auto-generated method stub
		if(c!=null) {
			list.add(c);
			return c;
		}
		return null;
	}

	@Override
	public String updateCourse(long id, Course newCourse) {
		for(Course c:list)
			if(c.getId()==id) {
				list.set(list.indexOf(c), newCourse);
				return "New course updated";
			}
		return "Update not successfull";
	}

	@Override
	public String deleteCourse(long id) {
		// TODO Auto-generated method stub
		for(Course c:list) 
			if(c.getId()==id) {
				list.remove(list.indexOf(c));
				return "Course id :"+id+" deleted";
			}
		return "Could not delete";
	}

	
}
