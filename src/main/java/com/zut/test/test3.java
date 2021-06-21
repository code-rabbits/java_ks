package com.zut.test;

import com.zut.entity.Student;
import com.zut.service.StudentService;

public class test3 {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        Student student = new Student();
        student.setSno("2019");
        student.setSname("聂建QQ");
        studentService.add(student);
    }
}
