package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.JobTitleService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.JobTitleDao;
import com.koc.hrms.entities.concretes.JobTitle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {

    private JobTitleDao jobTitleDao;

    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao) {
        this.jobTitleDao = jobTitleDao;
    }

    @Override
    public DataResult<List<JobTitle>> getAll() {
        return new SuccessDataResult<List<JobTitle>>(this.jobTitleDao.findAll(),"Başarılı bir şekilde listelenmiştir.");
    }

    @Override
    public Result add(JobTitle jobTitle) {
        this.jobTitleDao.save(jobTitle);
        return new SuccessResult("Başarılı bir şekilde eklenmiştir.");
    }
}
