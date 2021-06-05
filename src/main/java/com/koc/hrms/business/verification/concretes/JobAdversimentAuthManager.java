package com.koc.hrms.business.verification.concretes;

import com.koc.hrms.business.verification.abstracts.JobAdvertisementAuthService;
import com.koc.hrms.entities.concretes.JobAdvertisement;
import org.springframework.stereotype.Service;

@Service
public class JobAdversimentAuthManager implements JobAdvertisementAuthService {

    @Override
    public boolean descripControl(JobAdvertisement jobAdvertisement) {
        if (jobAdvertisement.getDescription() == null || jobAdvertisement.getDescription().isBlank()){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public boolean salaryControl(JobAdvertisement jobAdvertisement) {
        if (jobAdvertisement.getMinSalary() < 2838 || jobAdvertisement.getMinSalary() == null
                || jobAdvertisement.getMaxSalary() == null){
            return false;
        }else{
            return true;
        }
    }
}
