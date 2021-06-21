package com.zut.service;

import com.zut.dao.impl.CourseImpl;
import com.zut.entity.Course;
import com.zut.entity.CourseVo;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    CourseImpl courseDao=new CourseImpl();

    public List<Course> courseList(){
        return courseDao.courseList();
    }

    public void addCourse(Course course){
        courseDao.addCourse(course);
    }

    public void delCourse(String cno){
        courseDao.deleteCourse(cno);
    }

    public void updateCourse(Course course){
        courseDao.updateCourse(course);
    }

    public Course getByCno(String cno){
        return courseDao.selectByCno(cno);
    }

    public Course getByCname(String cname){
        return courseDao.selectByCname(cname);
    }


    public CourseVo getVo(){
        List<Course> courses = courseDao.courseList();
        List<String> names=new ArrayList<>();
        List<Integer> numbers=new ArrayList<>();
        for (Course c:courses){
            names.add(c.getCname());
            numbers.add(c.getNumber());
        }
        CourseVo vo = new CourseVo();
        vo.setNames(names);
        vo.setNumbers(numbers);
        return vo;
    }
}
