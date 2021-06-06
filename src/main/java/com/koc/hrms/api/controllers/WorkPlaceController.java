package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.WorkPlaceService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.WorkPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/api/workPlaces")
public class WorkPlaceController {

    private WorkPlaceService workPlaceService;

    public WorkPlaceController(WorkPlaceService workPlaceService) {
        this.workPlaceService = workPlaceService;
    }

    @GetMapping(value = "/getAll")
    public DataResult<List<WorkPlace>> getAll(){
        return workPlaceService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody WorkPlace workPlace){
        return ResponseEntity.ok(this.workPlaceService.add(workPlace));
    }
}