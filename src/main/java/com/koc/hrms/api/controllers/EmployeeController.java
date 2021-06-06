package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.EmployeeService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "/getAll")
    DataResult<List<Employee>> getAll(){
        return employeeService.getAll();
    }


    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody Employee employee){
        return ResponseEntity.ok(this.employeeService.add(employee));
    }

}
