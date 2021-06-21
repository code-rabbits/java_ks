package com.zut.service;

import com.zut.dao.impl.StudentImpl;
import com.zut.entity.Student;
import com.zut.entity.StudentVo;

import java.util.ArrayList;
import java.util.List;


public class StudentService {

    StudentImpl studentDao=new StudentImpl();

    public List<Student> stuList(){
        return studentDao.stuList();
    }

    public void add(Student student){
        studentDao.addStudent(student);
    }

    public void delStu(String sno){
        studentDao.deleteStudent(sno);
    }

    public Student getBySno(String sno){
        return studentDao.selectBySno(sno);
    }

    public void updateStu(Student student){
         studentDao.updateStudent(student);
    }

    public Student getStuBySno(String sno){

        return studentDao.selectBySno(sno);
    }

    public Student getStuBySname(String sname){

        return studentDao.selectBySname(sname);
    }


    public List<StudentVo> getStudentVo(){
        List<StudentVo> list=new ArrayList<>();
        int male = studentDao.countMale();
        int female = studentDao.countFemale();
        StudentVo studentVo1 = new StudentVo(male,"男");
        StudentVo studentVo2 = new StudentVo(female,"女");
        list.add(studentVo1);
        list.add(studentVo2);
        return list;
    }
}
