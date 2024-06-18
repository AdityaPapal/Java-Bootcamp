package com.springJDBC.JDBCexample.Repositories;

import com.springJDBC.JDBCexample.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class studentRepo {

    private JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(student std) {
        String sql = "INSERT INTO students (Rollno,Name,Marks)  VALUES (?,?,?)";
        int row = jdbc.update(sql,std.getRollNo(),std.getName(),std.getMarks());
        System.out.println(row+" effected");
    }


    public List<student> findAll() {
       String sql = "SELECT * FROM students";
        RowMapper<student> mapper  = new RowMapper<student>() {
            @Override
            public student mapRow(ResultSet rs, int rowNum) throws SQLException {
                student s = new student();
                s.setRollNo(rs.getInt("Rollno"));
                s.setName(rs.getString("Name"));
                s.setMarks(rs.getInt("Marks"));
                return s;
            }
        };
       return jdbc.query(sql,mapper);

    }
}
