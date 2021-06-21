package com.zut.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import com.zut.entity.*;
import com.zut.service.CourseService;
import com.zut.service.StudentService;

import com.zut.service.VoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ViewController {

    StudentService studentService= new StudentService();
    CourseService courseService=new CourseService();

    VoService voService= new VoService();

    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }

    @RequestMapping("/studentList")
    public String studentList(Model model){
        List<Student> students = studentService.stuList();
        model.addAttribute("students",students);

        return "index";
    }

    @RequestMapping("/toAddStudent")
    public String toAddStudent(){

        return "addStudent";
    }

    @RequestMapping("/addStudent")
    public String addStudent(Student student){
        studentService.add(student);
        return "redirect:/studentList";
    }

    @RequestMapping("/delStu/{sno}")
    public String delStu(@PathVariable("sno") String sno){
        studentService.delStu(sno);
        return "redirect:/studentList";
    }

    @RequestMapping("/toUpdateStudent")
    public String toUpdateStudent(Model model,String sno){
        Student student = studentService.getBySno(sno);
        model.addAttribute("student",student);
        return "updateStudent";
    }

    @RequestMapping("/updateStu")
    public String updateStu(Student student){
        studentService.updateStu(student);
        return "redirect:/studentList";
    }

    @RequestMapping("/getBySno")
    public String getBySno(String sno,Model model){
        Student student = studentService.getBySno(sno);
        List<Student> list=new ArrayList<>();
        list.add(student);
        if (student.getSno()==null){
            list=studentService.stuList();
            model.addAttribute("msg","未查询到该学号对应的学生");
        }
        model.addAttribute("students",list);
        return "index";
    }


    @RequestMapping("/getBySname")
    public String getBySname(String sname,Model model){
        Student student = studentService.getStuBySname(sname);
        List<Student> list=new ArrayList<>();
        list.add(student);
        if (student.getSno()==null){
            list=studentService.stuList();
            model.addAttribute("error","未查询到该姓名对应的学生");
        }
        model.addAttribute("students",list);
        return "index";
    }





    @GetMapping("/course.html")
    public String toCourse(){
        return "course";
    }


    @RequestMapping("/courseList")
    public String courseList(Model model){
        List<Course> courses = courseService.courseList();
        model.addAttribute("courses",courses);

        return "course";
    }

    @RequestMapping("/toAddCourse")
    public String toAddCourse(){

        return "addCourse";
    }

    @RequestMapping("/addCourse")
    public String addCourse(Course course){
        courseService.addCourse(course);

        return "redirect:/courseList";
    }

    @RequestMapping("/delCourse/{cno}")
    public String delCourse(@PathVariable("cno") String cno){
        courseService.delCourse(cno);

        return "redirect:/courseList";
    }

    @RequestMapping("/toUpdateCourse")
    public String toUpdateCourse(Model model,String cno){
        Course course = courseService.getByCno(cno);

        model.addAttribute("course",course);
        return "updateCourse";
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(Course course){
        courseService.updateCourse(course);

        return "redirect:/courseList";
    }

    @RequestMapping("/getByCno")
    public String getByCno(String cno,Model model){
        Course course = courseService.getByCno(cno);

        List<Course> list=new ArrayList<>();
        list.add(course);
        if (course.getCno()==null){
            list=courseService.courseList();

            model.addAttribute("msg","未查询到该课程代码对应的课程");
        }
        model.addAttribute("courses",list);
        return "course";
    }


    @RequestMapping("/getByCname")
    public String getByCname(String cname,Model model){
        Course course = courseService.getByCname(cname);

        List<Course> list=new ArrayList<>();
        list.add(course);
        if (course.getCno()==null){

            list=courseService.courseList();
            model.addAttribute("error","未查询到该课程名称对应的课程");
        }
        model.addAttribute("courses",list);
        return "course";
    }





    @RequestMapping("/xuanxiu.html")
    public String xuanxiu(){
        return "xuanxiu";
    }


    @RequestMapping("/voList")
    public String voList(Model model){
        List<VO> voList = voService.voList();
        model.addAttribute("voList",voList);
        return "xuanxiu";
    }





    @RequestMapping("/tongji.html")
    public String tongji(){
        return "tongji";
    }


    @RequestMapping("/Count")
    @ResponseBody
    public CourseVo getCount() throws JsonProcessingException {
        CourseVo vo = courseService.getVo();
        return vo;
    }

    @RequestMapping("/countMale")
    @ResponseBody
    public List<StudentVo> couontMale(){

        return studentService.getStudentVo();

    }

    @RequestMapping("/countStu.html")
    public String toCountStu(){
        return "countStu";
    }




}
