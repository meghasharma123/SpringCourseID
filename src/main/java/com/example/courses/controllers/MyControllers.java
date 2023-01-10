package com.example.courses.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.courses.entities.Course;
import com.example.courses.services.CourseService;

@RestController
public class MyControllers {

    @Autowired
    private CourseService courseService;

    // get request 
    @GetMapping("/home")
    public String home(){
        return " Welcome Page!! ";
    }

    @GetMapping("/courses")
    public List<Course> getCourse(){
        return this.courseService.getCourse() ;
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping(path = "/courses",consumes = "application/json")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}
