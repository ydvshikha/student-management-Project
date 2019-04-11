package com.nuptse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nuptse.model.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{
	  Course findByCourseName(String coursename);
	  Course findByCourseId(int id);
}
