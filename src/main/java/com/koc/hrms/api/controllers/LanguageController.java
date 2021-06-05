package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.LanguageService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private LanguageService languageService;

    @Autowired
    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public DataResult<List<Language>> getAll(){
        return this.languageService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Language language){
        return languageService.add(language);
    }
}
