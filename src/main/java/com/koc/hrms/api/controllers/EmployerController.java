package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.EmployerService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Employee;
import com.koc.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {

    private EmployerService employerService;

    @Autowired
    public EmployerController(EmployerService employerService) {
        this.employerService = employerService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Employer>> getAll(){
        return employerService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Employer employer){
        return employerService.add(employer);
    }

}
