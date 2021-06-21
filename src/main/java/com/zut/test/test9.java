package com.zut.test;

import com.zut.dao.impl.VoImpl;
import com.zut.entity.VO;

import java.util.List;

public class test9 {
    public static void main(String[] args) {
        VoImpl vo = new VoImpl();

        List<VO> voList = vo.voList();
        for (VO v:voList){
            System.out.println(v);
        }
    }
}
