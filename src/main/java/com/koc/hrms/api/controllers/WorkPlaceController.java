package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.WorkPlaceService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.WorkPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/workPlaces")
public class WorkPlaceController {

    private WorkPlaceService workPlaceService;

    @Autowired
    public WorkPlaceController(WorkPlaceService workPlaceService) {
        this.workPlaceService = workPlaceService;
    }

    @GetMapping("/getAll")
    public DataResult<List<WorkPlace>> getAll(){
        return workPlaceService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody WorkPlace workPlace){
        return workPlaceService.add(workPlace);
    }
}