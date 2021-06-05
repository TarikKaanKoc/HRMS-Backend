package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.EmployerService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.EmployerDao;
import com.koc.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {

    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public Result add(Employer employer) {
       this.employerDao.save(employer);
       return new SuccessResult("İş veren başarılı bir şekilde eklenmiştir.");
    }

    @Override
    public DataResult<List<Employer>> getAll() {
        return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Sayın tarık kaan koç iş verenler başarılı bir şelilde listelenmitşir.");
    }
}
