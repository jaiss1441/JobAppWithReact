package com.example.JopAppWithReact;

import com.example.JopAppWithReact.model.JobPost;
import com.example.JopAppWithReact.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("localhost:3000")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping("jobPosts")
    @ResponseBody
    public List<JobPost> allJobPost(){
        return jobService.getallJobs();
    }

    @PostMapping
    public String AddJob(){
        return "New Job";
    }

}
