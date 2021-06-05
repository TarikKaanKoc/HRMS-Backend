package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.AbilityService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/abilities")
public class AbilityController {

    private AbilityService abilityService;

    @Autowired
    public AbilityController(AbilityService abilityService) {
        this.abilityService = abilityService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Ability>> getAll(){
        return this.abilityService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Ability ability) {
        return this.abilityService.add(ability);
    }
}
