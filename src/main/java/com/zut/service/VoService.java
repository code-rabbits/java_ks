package com.zut.service;

import com.zut.dao.impl.VoImpl;
import com.zut.entity.VO;

import java.util.List;

public class VoService {
    VoImpl voService =new VoImpl();

    public List<VO> voList(){
        return voService.voList();
    }
}
