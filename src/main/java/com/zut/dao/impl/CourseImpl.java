package com.zut.dao.impl;

import com.zut.dao.CourseDao;
import com.zut.entity.Course;

import com.zut.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseImpl implements CourseDao {
    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    @Override
    public void addCourse(Course course) {
        try {
            //1.获取连接
            conn= JDBCUtils.getConnection();
            //2.定义sql语句
            String sql="insert into course (cno,cname,nature,hours,credit,open,number) values(?,?,?,?,?,?,?)";
            //3.创建PreparedStatement对象,传入SQL语句
            ps=conn.prepareStatement(sql);
            //4.向SQL语句传入参数
            ps.setString(1,course.getCno());
            ps.setString(2,course.getCname());
            ps.setString(3,course.getNature());
            ps.setInt(4,course.getHours());
            ps.setInt(5,course.getCredit());
            ps.setString(6,course.getOpen());
            ps.setInt(7,course.getNumber());

            //5.执行SQL语句
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //6.关闭资源
            JDBCUtils.closeConnection(conn);
            JDBCUtils.closeStatement(ps);
        }
    }

    @Override
    public Course selectByCno(String cno) {
        Course course = new Course();

        try {
            conn=JDBCUtils.getConnection();
            String sql="select * from course where cno=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,cno);

            rs= ps.executeQuery();

            //遍历结果集
            while (rs.next()){
                course.setCno(rs.getString("cno"));
                course.setCname(rs.getString("cname"));
                course.setNature(rs.getString("nature"));
                course.setHours(rs.getInt("hours"));
                course.setCredit(rs.getInt("credit"));
                course.setOpen(rs.getString("open"));
                course.setNumber(rs.getInt("number"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return course;
    }

    @Override
    public Course selectByCname(String cname) {
        Course course = new Course();

        try {
            conn=JDBCUtils.getConnection();
            String sql="select * from course where cname =?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,cname);
            rs= ps.executeQuery();

            //遍历结果集
            while (rs.next()){
                course.setCno(rs.getString("cno"));
                course.setCname(rs.getString("cname"));
                course.setNature(rs.getString("nature"));
                course.setHours(rs.getInt("hours"));
                course.setCredit(rs.getInt("credit"));
                course.setOpen(rs.getString("open"));
                course.setNumber(rs.getInt("number"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return course;
    }

    @Override
    public List<Course> courseList() {

        List<Course> list=new ArrayList<>();

        try {
            conn=JDBCUtils.getConnection();
            String sql="select * from course";
            ps=conn.prepareStatement(sql);

            rs=ps.executeQuery();

            //遍历结果集
            while (rs.next()){
                Course course = new Course();
                course.setCno(rs.getString("cno"));
                course.setCname(rs.getString("cname"));
                course.setNature(rs.getString("nature"));
                course.setHours(rs.getInt("hours"));
                course.setCredit(rs.getInt("credit"));
                course.setOpen(rs.getString("open"));
                course.setNumber(rs.getInt("number"));

                list.add(course);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return list;
    }

    @Override
    public void updateCourse(Course course) {
        try {
            conn=JDBCUtils.getConnection();
            String sql="update course set cname=?,nature=?,hours=?,credit=?,open=?,number=? where cno=?";
            ps=conn.prepareStatement(sql);

            ps.setString(1,course.getCname());
            ps.setString(2,course.getNature());
            ps.setInt(3,course.getHours());
            ps.setInt(4,course.getCredit());
            ps.setString(5,course.getOpen());
            ps.setInt(6,course.getNumber());
            ps.setString(7,course.getCno());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConnection(conn);
            JDBCUtils.closeStatement(ps);
        }
    }

    @Override
    public void deleteCourse(String cno) {
        try {
            conn=JDBCUtils.getConnection();
            String sql="delete from course where cno=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,cno);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConnection(conn);
            JDBCUtils.closeStatement(ps);
        }
    }

    @Override
    public int countCourse() {
        int count=0;
        try {
            conn=JDBCUtils.getConnection();

            String sql="select * from course";
            ps=conn.prepareStatement(sql);

            rs=ps.executeQuery();

            while (rs.next()){
                count++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return count;
    }
}
