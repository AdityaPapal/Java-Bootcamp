package com.springproject.Job.App.service;

import com.springproject.Job.App.model.jobpost;
import com.springproject.Job.App.repositories.jobrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class jobservice {

    @Autowired
    private jobrepo repo;

    public void addjob(jobpost job){
            repo.addjob(job);
        }
    public List<jobpost> getalljob(){
            return repo.getalljob();
    }

}
