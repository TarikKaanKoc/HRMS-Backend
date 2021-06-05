package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.JobAdvertisementService;
import com.koc.hrms.business.verification.abstracts.JobAdvertisementAuthService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.JobAdvertisementDao;
import com.koc.hrms.entities.concretes.JobAdvertisement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {

    private  JobAdvertisementDao jobAdvertisementDao;
    private  JobAdvertisementAuthService jobAdvertisementAuthService;


    @Autowired
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao, JobAdvertisementAuthService jobAdvertisementAuthService) {
        this.jobAdvertisementDao = jobAdvertisementDao;
        this.jobAdvertisementAuthService = jobAdvertisementAuthService;
    }

    @Override
    public DataResult<List<JobAdvertisement>> getAll() {
        return new SuccessDataResult<>(this.jobAdvertisementDao.findAll(), "İş ilanları başarılı bir şekilde listelenmiştir.");
    }

    @Override
    public Result add(JobAdvertisement jobAdvertisement) {
     this.jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult("İş ilanı başarılı bir şekilde eklenmiştir.");
    }


    @Override
    public DataResult<List<JobAdvertisement>> getByEnableTrue() {
        return new SuccessDataResult<List<JobAdvertisement>>
                (this.jobAdvertisementDao.getByEnableTrue() ,"Aktif iş ilanları başarılı bir şekilde listelenmiştir.");
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEnableFalse() {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableFalse());
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEmployerId(int employerId) {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployerId(employerId));
    }

    @Override
    public DataResult<List<JobAdvertisement>> getByEnableTrueAndEmployers_Id(int id) {
        return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEnableTrueAndEmployer_Id(id), "İşlem başarılı bir şekilde gerçekleşmiiştir.");
    }


    @Override
    public Result update(JobAdvertisement jobAdversiment) {
        this.jobAdvertisementDao.save(jobAdversiment);
        return new SuccessResult("İş ilanı başarılı bir şekilde güncellenmiştir.");
    }
}
