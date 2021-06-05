package com.koc.hrms.business.verification.concretes;

import com.koc.hrms.business.verification.abstracts.JobSeekerAuthService;
import com.koc.hrms.dataaccess.abstracts.EmployerDao;
import com.koc.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobSeekerAuthManager implements JobSeekerAuthService {


    private EmployerDao employerDao;

    @Autowired
    public JobSeekerAuthManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public boolean checkName(JobSeeker jobSeeker) {
         if (jobSeeker.getFirstName().isBlank() || jobSeeker.getFirstName() == null) {

            return false;
        }
        return true;
    }

    @Override
    public boolean checkPassword(JobSeeker jobSeeker) {
        if (jobSeeker.getPassword().isBlank() || jobSeeker.getPassword() == null) {

            return false;
        }
        return true;
    }

    @Override
    public boolean checkLastName(JobSeeker jobSeeker) {
        if (jobSeeker.getLastName().isBlank() || jobSeeker.getLastName() == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean checkIdentyNumber(JobSeeker jobSeeker) {
        if (jobSeeker.getIdentificatioNumber().isBlank() || jobSeeker.getIdentificatioNumber() == null) {
            return false;
        }
        return true;
    }

    @Override
    public boolean signWithMernis(JobSeeker jobSeeker) {
     return true;
    }
}
