package com.durgesh.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;

import com.durgesh.model.Course;
import com.durgesh.model.User;

public interface IUserService {
	
	User saveUser(User user);
	List<Course> getByTechnology(String technology);
	List<Course> getAllCourse();
	void deleteByCourseName(String courseName);

	List<Course> getByDurationRange(String technology,Double courseDuration);
	
	List<Course> findPaginated(int pageNo, int pageSize);
	User userLogin(@PathVariable String email,@PathVariable String password);
	 
	 

}
