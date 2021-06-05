package com.koc.hrms.business.verification.concretes;

import com.koc.hrms.business.verification.abstracts.EmployerAuthService;
import com.koc.hrms.dataaccess.abstracts.EmployerDao;
import com.koc.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployerAuthManager implements EmployerAuthService {


    private final EmployerDao employerDao;

    @Autowired
    public EmployerAuthManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public boolean companyNameCheck(Employer employer) {
        if (employer.getCompanyName().isBlank() || employer.getCompanyName() == null ){
            return false;
        }
        return true;
    }

    @Override
    public boolean webSiteCheck(Employer employer) {
        if (employer.getWebAdres().isBlank() || employer.getWebAdres() == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean passwordCheck(Employer employer) {
        if (employer.getPassword().isBlank() || employer.getPassword() == null){
            return false;
        }
        return true;
    }

    @Override
    public boolean emailCheck(Employer employer) {
        if (employerDao.findAllByEmailAddress(employer.getEmailAddress()).stream().count() !=0 ){
            return false;
        }
        return true;
    }
}
