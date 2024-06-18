package com.springproject.Job.App.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class jobpost {
    private int postid;
    private String postprofile;
    private String postdesc;
    private int reqExperience;
}
