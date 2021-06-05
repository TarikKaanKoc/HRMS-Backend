package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.SocialMediaService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.SocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/socialMedias")
public class SocialMediaController {

    private SocialMediaService socialMediaService;

    @Autowired
    public SocialMediaController(SocialMediaService socialMediaService) {
        this.socialMediaService = socialMediaService;
    }

    @GetMapping("/getAll")
    public DataResult<List<SocialMedia>> getAll(){
        return socialMediaService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody SocialMedia socialMedia){
        return socialMediaService.add(socialMedia);
    }

}
