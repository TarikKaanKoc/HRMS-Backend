package com.koc.hrms.business.verification.abstracts;

import com.koc.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementAuthService {

    boolean descripControl (JobAdvertisement jobAdvertisement);
    boolean salaryControl (JobAdvertisement jobAdvertisement);

}
