package com.zut.test;

import com.zut.dao.impl.StudentImpl;
import com.zut.entity.Student;


public class test1 {
    public static void main(String[] args) {
        StudentImpl student = new StudentImpl();
        Student student1 = student.selectBySno("2019015121");
        System.out.println(student1);
    }
}
