package com.example.courses.services;

import java.util.List;

import com.example.courses.entities.Course;

public interface CourseService {
    public List<Course> getCourse();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
}
