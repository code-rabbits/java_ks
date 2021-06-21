package com.zut.test;

import com.zut.entity.Student;
import com.zut.service.StudentService;

public class test4 {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student student = service.getBySno("123589");
        System.out.println(student);
    }
}
