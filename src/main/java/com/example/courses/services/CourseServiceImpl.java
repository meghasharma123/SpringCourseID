package com.example.courses.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.courses.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {


    List<Course> list;
    public CourseServiceImpl(){
        list = new ArrayList<>();
        list.add(new Course(145,"Java","For Smart people"));
        list.add(new Course(343,"spring","created for you"));
    }

    @Override
    public List<Course> getCourse() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        for(Course course : list){
            if(course.getId() == courseId){
                c = course;
                break;
            }
        }
        return c;
    }
    @Override
    public Course addCourse(Course course){
        list.add(course);
        return course;
    }
}
