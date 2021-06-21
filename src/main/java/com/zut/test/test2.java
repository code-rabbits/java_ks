package com.zut.test;

import com.zut.entity.Student;
import com.zut.service.StudentService;

import java.util.List;

public class test2 {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();

        List<Student> students = studentService.stuList();
        for (Student s:students){
            System.out.println(s);
        }
    }
}
