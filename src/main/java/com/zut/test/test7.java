package com.zut.test;

import com.zut.entity.Course;
import com.zut.service.CourseService;

public class test7 {
    public static void main(String[] args) {
        CourseService courseService=new CourseService();
        Course course = courseService.getByCno("102");
        course.setCname("聂建强");
        courseService.updateCourse(course);
        System.out.println(course);
    }
}
