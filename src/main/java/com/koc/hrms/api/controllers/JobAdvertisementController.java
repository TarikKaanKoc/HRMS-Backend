package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.JobAdvertisementService;
import com.koc.hrms.business.abstracts.JobSeekerService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobAdvertisement;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/jobadvertisements")
public class JobAdvertisementController {

    private JobAdvertisementService advertisementService;

    public JobAdvertisementController(JobAdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping(value = "/getAll")
    public DataResult<List<JobAdvertisement>> getAll(){
        return advertisementService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody JobAdvertisement jobAdvertisement) {
        return ResponseEntity.ok(this.advertisementService.add(jobAdvertisement));
    }

    @PutMapping(value = "/update")
    public ResponseEntity<?> update(@RequestParam int id, @RequestBody JobAdvertisement jobAdvertisement) {
       return ResponseEntity.ok(this.advertisementService.update(jobAdvertisement));
    }

    @GetMapping(value = "/active")
    public DataResult<List<JobAdvertisement>> getByEnableTrue() {
        return this.advertisementService.getByEnableTrue();
    }

    @GetMapping(value = "/disable")
    public DataResult<List<JobAdvertisement>> getByEnableFalse() {
        return this.advertisementService.getByEnableFalse();
    }

    @GetMapping(value = "/employerId")
    public DataResult<List<JobAdvertisement>> getByEmployerId(@RequestParam int employerId) {
        return this.advertisementService.getByEmployerId(employerId);
    }

    @GetMapping(value = "/compnayTrue")
    public DataResult<List<JobAdvertisement>> getByEnableTrueAndEmployers_Id(@RequestParam int id) {
        return this.advertisementService.getByEnableTrueAndEmployers_Id(id);
    }

}
