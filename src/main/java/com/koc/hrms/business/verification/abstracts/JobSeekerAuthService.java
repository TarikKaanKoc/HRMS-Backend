package com.koc.hrms.business.verification.abstracts;

import com.koc.hrms.entities.concretes.JobSeeker;

public interface JobSeekerAuthService {

    boolean checkName(JobSeeker jobSeeker);
    boolean checkPassword(JobSeeker jobSeeker);
    boolean checkLastName(JobSeeker jobSeeker);
    boolean checkIdentyNumber(JobSeeker jobSeeker);
    boolean signWithMernis(JobSeeker jobSeeker);

}
