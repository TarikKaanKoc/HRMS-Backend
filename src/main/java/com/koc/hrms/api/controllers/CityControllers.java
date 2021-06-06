package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.CityService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.City;
import com.koc.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/cities")
public class CityControllers {

    private CityService cityService;

    public CityControllers(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/getAll")
    public DataResult<List<City>> getAll(){
        return cityService.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<?> add(@RequestBody City city){
        return ResponseEntity.ok(this.cityService.add(city));
    }
}
