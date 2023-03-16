package com.alchta.springboot.learnspringbootweb;


//   Course : "id", name, author


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    //map url
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1, "course1", "learn spring"),
                new Course(2, "course2", "learn spring"),
                new Course(3, "course3", "learn spring")
        );
    }
}
