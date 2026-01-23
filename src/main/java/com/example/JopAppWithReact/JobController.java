package com.example.JopAppWithReact;

import com.example.JopAppWithReact.model.JobPost;
import com.example.JopAppWithReact.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping(path = "jobPosts",produces ="application/xml")
    public List<JobPost> allJobPost(){
        return jobService.getallJobs();
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getJob(@PathVariable("postId") int postId){
        return jobService.getJobPost(postId);
    }


    @PostMapping(path = "jobPost", consumes = "application/xml")
    public void addJobs(@RequestBody JobPost jobPost){
        jobService.addJob(jobPost);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        jobService.updateJob(jobPost);
        return jobService.getJobPost(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        jobService.deleteJob(postId);
        return "Deleted";
    }

    @Override
    public String toString() {

    }
}
