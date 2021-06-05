package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.JobSeekerCvService;
import com.koc.hrms.business.abstracts.JobSeekerService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobSeeker;
import com.koc.hrms.entities.concretes.JobSeekerCv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@RestController
@RequestMapping("/api/jobSeekerCvs")
public class JobSeekerCvConrtroller {

    private JobSeekerCvService jobSeekerCvService;

    @Autowired
    public JobSeekerCvConrtroller(JobSeekerCvService jobSeekerCvService  ) {
        this.jobSeekerCvService = jobSeekerCvService;
    }


    @GetMapping("/getAllCv")
    public DataResult<List<JobSeekerCv>> getAll(){
        return this.jobSeekerCvService.getAll();
    }

    @PostMapping("/addCv")
    public Result add(@RequestBody JobSeekerCv jobSeekerCv){
        return this.jobSeekerCvService.add(jobSeekerCv);
    }

    @PostMapping("imageupload")
    public ResponseEntity<?> uploadPhoto(@RequestParam("file") MultipartFile file,int jobSeekerId){

        return ResponseEntity.ok(jobSeekerCvService.uploadPhoto(file,jobSeekerId));
    }

    @GetMapping("/getCvJobSeeker")
    public DataResult<JobSeekerCv> findJobSeekerCvById(@RequestParam int jobSeekerId){
        return this.jobSeekerCvService.findJobSeekerCvById(jobSeekerId);
    }

}
