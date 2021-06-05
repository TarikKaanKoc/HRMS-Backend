package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.JobAdvertisementService;
import com.koc.hrms.business.abstracts.JobSeekerService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobadvertisements")
public class JobAdvertisementController {

    private JobAdvertisementService advertisementService;

    @Autowired
    public JobAdvertisementController(JobAdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping("/getAll")
    public DataResult<List<JobAdvertisement>> getAll(){
        return advertisementService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody JobAdvertisement jobAdvertisement) {
        return advertisementService.add(jobAdvertisement);
    }

    @PutMapping("/update")
    public Result update(@RequestParam int id, @RequestBody JobAdvertisement jobAdvertisement) {
       return this.advertisementService.update(jobAdvertisement);
    }

    @GetMapping("/active")
    public DataResult<List<JobAdvertisement>> getByEnableTrue() {
        return this.advertisementService.getByEnableTrue();
    }

    @GetMapping("/disable")
    public DataResult<List<JobAdvertisement>> getByEnableFalse() {
        return this.advertisementService.getByEnableFalse();
    }

    @GetMapping("/employerId")
    public DataResult<List<JobAdvertisement>> getByEmployerId(@RequestParam int employerId) {
        return this.advertisementService.getByEmployerId(employerId);
    }

    @GetMapping("/compnayTrue")
    public DataResult<List<JobAdvertisement>> getByEnableTrueAndEmployers_Id(@RequestParam int id) {
        return this.advertisementService.getByEnableTrueAndEmployers_Id(id);
    }

}
