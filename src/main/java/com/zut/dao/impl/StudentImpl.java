package com.zut.dao.impl;

import com.zut.dao.StudentDao;
import com.zut.entity.Student;
import com.zut.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentDao {

    private Connection conn=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;

    @Override
    public void addStudent(Student student) {
        try {
            //1.获取连接
            conn= JDBCUtils.getConnection();
            //2.定义sql语句
            String sql="insert into student (sno,sname,sex,age,sdept,clas,phone) values(?,?,?,?,?,?,?)";
            //3.创建PreparedStatement对象,传入SQL语句
            ps=conn.prepareStatement(sql);
            //4.向SQL语句传入参数
            ps.setString(1,student.getSno());
            ps.setString(2,student.getSname());
            ps.setString(3,student.getSex());
            ps.setInt(4,student.getAge());
            ps.setString(5,student.getSdept());
            ps.setString(6,student.getClas());
            ps.setString(7,student.getPhone());

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
    public Student selectBySno(String sno) {
        Student student = new Student();

        try {
            conn=JDBCUtils.getConnection();
            String sql="select * from student where sno=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,sno);

            rs= ps.executeQuery();

            //遍历结果集
            while (rs.next()){
                student.setSno(rs.getString("sno"));
                student.setSname(rs.getString("sname"));
                student.setSex(rs.getString("sex"));
                student.setAge(rs.getInt("age"));
                student.setSdept(rs.getString("sdept"));
                student.setClas(rs.getString("clas"));
                student.setPhone(rs.getString("phone"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return student;
    }

    @Override
    public Student selectBySname(String sname) {
        Student student = new Student();

        try {
            conn=JDBCUtils.getConnection();
            String sql="select * from student where sname =?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,sname);
            rs= ps.executeQuery();

            //遍历结果集
            while (rs.next()){
                student.setSno(rs.getString("sno"));
                student.setSname(rs.getString("sname"));
                student.setSex(rs.getString("sex"));
                student.setAge(rs.getInt("age"));
                student.setSdept(rs.getString("sdept"));
                student.setClas(rs.getString("clas"));
                student.setPhone(rs.getString("phone"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return student;
    }

    @Override
    public List<Student> stuList() {

        List<Student> list=new ArrayList<>();

        try {
            conn=JDBCUtils.getConnection();
            String sql="select * from student";
            ps=conn.prepareStatement(sql);

            rs=ps.executeQuery();

            //遍历结果集
            while (rs.next()){
                Student student = new Student();

                student.setSno(rs.getString("sno"));
                student.setSname(rs.getString("sname"));
                student.setSex(rs.getString("sex"));
                student.setAge(rs.getInt("age"));
                student.setSdept(rs.getString("sdept"));
                student.setClas(rs.getString("clas"));
                student.setPhone(rs.getString("phone"));
                list.add(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeResource(conn,ps,rs);
        }
        return list;
    }

    @Override
    public void updateStudent(Student student) {
        try {
            conn=JDBCUtils.getConnection();
            String sql="update student set sname=?,sex=?,age=?,sdept=?,clas=?,phone=? where sno=?";
            ps=conn.prepareStatement(sql);

            ps.setString(1,student.getSname());
            ps.setString(2,student.getSex());
            ps.setInt(3,student.getAge());
            ps.setString(4,student.getSdept());
            ps.setString(5,student.getClas());
            ps.setString(6,student.getPhone());
            ps.setString(7,student.getSno());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConnection(conn);
            JDBCUtils.closeStatement(ps);
        }
    }

    @Override
    public void deleteStudent(String sno) {
        try {
            conn=JDBCUtils.getConnection();
            String sql="delete from student where sno=?";
            ps=conn.prepareStatement(sql);
            ps.setString(1,sno);

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            JDBCUtils.closeConnection(conn);
            JDBCUtils.closeStatement(ps);
        }
    }

    @Override
    public int countStudent() {
        int count=0;
        try {
            conn=JDBCUtils.getConnection();

            String sql="select * from student";
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

    @Override
    public int countMale() {
        int count=0;
        try {
            conn=JDBCUtils.getConnection();

            String sql="select * from student where sex='男' ";
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

    @Override
    public int countFemale() {
        int count=0;
        try {
            conn=JDBCUtils.getConnection();

            String sql="select * from student where sex='女' ";
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
