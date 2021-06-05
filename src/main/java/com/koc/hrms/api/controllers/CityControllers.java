package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.CityService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.City;
import com.koc.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cities")
public class CityControllers {

    private CityService cityService;

    @Autowired
    public CityControllers(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/getAll")
    public DataResult<List<City>> getAll(){
        return cityService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody City city){
        return cityService.add(city);
    }
}
