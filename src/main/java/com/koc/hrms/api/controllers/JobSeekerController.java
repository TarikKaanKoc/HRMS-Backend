package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.JobSeekerService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobseekers")
public class JobSeekerController {

    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobSeeker>> getAll(){
        return jobSeekerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.add(jobSeeker);
    }
}
