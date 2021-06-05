package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.JobSeekerService;
import com.koc.hrms.business.verification.abstracts.JobSeekerAuthService;
import com.koc.hrms.core.utilities.FakeMernisService;
import com.koc.hrms.core.utilities.results.*;
import com.koc.hrms.dataaccess.abstracts.JobSeekerDao;
import com.koc.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager implements JobSeekerService {

    private JobSeekerAuthService jobSeekerAuthService;
    private FakeMernisService fakeMernisService;
    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(FakeMernisService fakeMernisService, JobSeekerDao jobSeekerDao, JobSeekerAuthService jobSeekerAuthService) {
        this.fakeMernisService = fakeMernisService;
        this.jobSeekerDao = jobSeekerDao;
        this.jobSeekerAuthService = jobSeekerAuthService;
    }

    @Override
    public Result fakeMernis(JobSeeker jobSeeker) {
        if (!jobSeekerAuthService.signWithMernis(jobSeeker)) {
            return new ErrorResult("Maalesef Kimliğiniz Doğrulanmadı");

        } else
            this.jobSeekerDao.save(jobSeeker);
        return new SuccessDataResult<>("kimlik doğrulaması başarılı");
    }

    @Override
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(), "Sayın tarık kaan koç iş arayan kullanıcılar listelenmiştir.");
    }

    @Override
    public Result add(JobSeeker jobSeeker) {

        if (jobSeekerDao.findAllByEmailAddress(jobSeeker.getEmailAddress()).stream().count() != 0 || jobSeeker.getEmailAddress().isBlank()) {
            return new ErrorResult("aynı e mailden var");
        } else if (!jobSeekerAuthService.checkName(jobSeeker)) {
            return new ErrorDataResult<JobSeeker>(null, "İsim boş geçilemez");
        } else if (!jobSeekerAuthService.checkLastName(jobSeeker)) {
            return new ErrorDataResult<JobSeeker>(null, "Soyisim boş geçilemez");
        } else if (!jobSeekerAuthService.checkIdentyNumber(jobSeeker)) {
            return new ErrorDataResult<JobSeeker>(null, "T.C Kimlik No Boş Geçilemez");
        } else if (!jobSeekerAuthService.checkPassword(jobSeeker)) {
            return new ErrorDataResult<JobSeeker>(null, "Şifre boş geçilemez");
        } else {
            this.jobSeekerDao.save(jobSeeker);
            return new SuccessDataResult<>("İş arayan hesabı başarılı bir şekilde eklenmiştir.");
        }
    }
}
