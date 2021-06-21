package com.zut.entity;

import lombok.Data;

@Data
public class SC {
    private int sno;
    private int cno;
    private int grade;

    private Student student;
    private Course course;
}
