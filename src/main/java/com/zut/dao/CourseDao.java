package com.zut.dao;

import com.zut.entity.Course;

import java.util.List;

public interface CourseDao {

    void addCourse(Course course);

    Course selectByCno(String cno);

    Course selectByCname(String cname);

    List<Course> courseList();

    void updateCourse(Course course);

    void deleteCourse(String cno);

    int countCourse();



}
