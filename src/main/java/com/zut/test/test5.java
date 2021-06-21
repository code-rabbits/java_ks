package com.zut.test;

import com.zut.entity.Student;
import com.zut.service.StudentService;

public class test5 {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student student = service.getStuBySname("李四");
        System.out.println(student);
    }
}
