package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.UserService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.UserDao;
import com.koc.hrms.entities.concretes.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager implements UserService {

    private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public  DataResult<List<User>> getAll() {
     return    new SuccessDataResult<List<User>>(userDao.findAll(),"Sayın tarık kaan koç tüm kullanıcılar bşarılı bir şekilde listelenmiştir");

    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Yeni Kullanıcı Başarılı Bir Şekilde Eklenmiştir.");
    }

}
