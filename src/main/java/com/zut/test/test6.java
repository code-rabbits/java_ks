package com.zut.test;

import com.zut.entity.Course;
import com.zut.service.CourseService;

public class test6 {
    public static void main(String[] args) {
        CourseService courseService=new CourseService();

        Course course = courseService.getByCno("11");
        System.out.println(course);
    }
}
