package com.zut.entity;

import lombok.Data;

@Data
public class Course {
    private String cno;
    private String cname;
    private String nature;
    private int  hours;
    private int credit;
    private String open;
    private int number;
}
