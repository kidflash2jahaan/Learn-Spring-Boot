package com.system_err.learnspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return List.of(new Course(1, "Course 1", "Author of Course 1"), new Course(2, "Course 2", "Author of Course 2"), new Course(3, "Course 3", "Author of Course 3"));
    }
}
