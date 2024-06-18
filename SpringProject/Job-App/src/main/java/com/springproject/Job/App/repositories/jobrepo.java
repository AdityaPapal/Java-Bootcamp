package com.springproject.Job.App.repositories;

import com.springproject.Job.App.model.jobpost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Repository
public class jobrepo {

    List<jobpost> jobs = new ArrayList<>(Arrays.asList(
            new jobpost(1,"Java Dev","Must knowlage in java",1)
    ));
    public List<jobpost> getalljob(){
            return jobs;
    }
    public void addjob(jobpost job){
        jobs.add(job);
    }
}
