package com.koc.hrms.api.controllers;

import com.koc.hrms.business.abstracts.UserService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAll")
    public DataResult<List<User>> getAll(){
       return this.userService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody User user){
    return userService.add(user);
    }
}
