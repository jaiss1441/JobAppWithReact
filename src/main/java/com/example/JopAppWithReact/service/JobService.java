package com.example.JopAppWithReact.service;


import com.example.JopAppWithReact.model.JobPost;
import com.example.JopAppWithReact.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;

    // method to add a jobPost
    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    //method to return data
    public List<JobPost> getallJobs(){
        return repo.getAllJobs();
    }

    public JobPost getJobPost(int postId) {
        return repo.getJobPost(postId);
    }
}
