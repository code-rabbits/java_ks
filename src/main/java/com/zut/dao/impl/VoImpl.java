package com.zut.dao.impl;

import com.zut.dao.VODao;
import com.zut.entity.VO;
import com.zut.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VoImpl implements VODao {

    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;

    @Override
    public List<VO> voList() {
        List<VO> voList=new ArrayList<>();

        try {
            conn = JDBCUtils.getConnection();
            String sql="SELECT sname,cname,grade FROM sc,student,course WHERE sc.cno=course.cno AND sc.sno=student.sno";
            ps=conn.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()){
                VO vo = new VO();
                vo.setSname(rs.getString("sname"));
                vo.setCname(rs.getString("cname"));
                vo.setGrade(rs.getInt("grade"));

                voList.add(vo);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return voList;
    }
}
