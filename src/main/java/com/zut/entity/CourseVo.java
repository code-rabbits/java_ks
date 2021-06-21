package com.zut.entity;

import lombok.Data;

import java.util.List;

@Data
public class CourseVo {

    private List<String> names;
    private List<Integer> numbers;

}
