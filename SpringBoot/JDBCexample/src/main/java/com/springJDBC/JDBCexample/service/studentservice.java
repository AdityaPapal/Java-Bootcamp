package com.springJDBC.JDBCexample.service;

import com.springJDBC.JDBCexample.Repositories.studentRepo;
import com.springJDBC.JDBCexample.model.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentservice {

    private studentRepo repo;

    public studentRepo getRepo() {
        return repo;
    }

    @Autowired
    public void setRepo(studentRepo repo) {
        this.repo = repo;
    }

    public void addstd(student std) {
        repo.save(std);
    }

    public List<student> getStudents() {
        return repo.findAll();
    }
}
