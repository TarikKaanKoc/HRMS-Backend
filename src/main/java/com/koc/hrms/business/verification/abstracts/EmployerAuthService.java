package com.koc.hrms.business.verification.abstracts;

import com.koc.hrms.entities.concretes.Employer;

public interface EmployerAuthService {

    boolean companyNameCheck(Employer employer);
    boolean webSiteCheck(Employer employer);
    boolean passwordCheck(Employer employer);
    boolean emailCheck(Employer employer);
}
