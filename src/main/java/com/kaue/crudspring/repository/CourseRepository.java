package com.kaue.crudspring.repository;

import org.springframework.stereotype.Repository;

import com.kaue.crudspring.model.Course;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course ,Long>{
    
}
