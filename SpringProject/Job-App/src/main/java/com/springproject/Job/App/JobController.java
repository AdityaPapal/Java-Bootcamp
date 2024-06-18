package com.springproject.Job.App;

import com.springproject.Job.App.model.jobpost;
import com.springproject.Job.App.service.jobservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {
        @Autowired
        private jobservice service;

        @RequestMapping({"/","home"})
        public String home(){
            return "home";
        }

        @RequestMapping("addjob")
        public String addJob(){
            return "addjob";
        }

        @PostMapping("handleForm")
        public String handleform(jobpost jobPost){
            service.addjob(jobPost);
            return "success";
        }

        @GetMapping("viewalljobs")
        public String viewjobs(Model m){

            List<jobpost> jobs = service.getalljob();
            m.addAttribute("jobPosts",jobs);
            return "viewalljobs";
        }

}
