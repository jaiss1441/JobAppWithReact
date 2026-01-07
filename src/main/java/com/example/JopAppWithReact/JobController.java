package com.example.JopAppWithReact;

import com.example.JopAppWithReact.model.JobPost;
import com.example.JopAppWithReact.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    @ResponseBody
    public List<JobPost> allJobPost(){
        return jobService.getallJobs();
    }

}
