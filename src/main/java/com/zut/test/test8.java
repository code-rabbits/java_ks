package com.zut.test;

import com.zut.entity.CourseVo;
import com.zut.service.CourseService;

public class test8 {
    public static void main(String[] args) {
        CourseService courseService=new CourseService();
        CourseVo vo = courseService.getVo();
        System.out.println(vo);
    }
}
