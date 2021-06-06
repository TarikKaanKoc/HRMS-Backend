package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.JobTitleService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/api/jobtitles")
public class JobTitleController {


    private JobTitleService jobTitleService;

    public JobTitleController(JobTitleService jobTitleService) {
        super();
        this.jobTitleService = jobTitleService;
    }

    @GetMapping(value = "/getall")
    public DataResult<List<JobTitle>> getAll(){
        return jobTitleService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(JobTitle jobTitle){
        return ResponseEntity.ok(this.jobTitleService.add(jobTitle));
    }
}
