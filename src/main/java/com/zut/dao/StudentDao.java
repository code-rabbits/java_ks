package com.zut.dao;

import com.zut.entity.Student;

import java.util.List;

public interface StudentDao {
    void addStudent(Student student);

    Student selectBySno(String sno);

    Student selectBySname(String sname);

    List<Student> stuList();

    void updateStudent(Student student);

    void deleteStudent(String sno);

    int countStudent();

    int countMale();

    int countFemale();
}
