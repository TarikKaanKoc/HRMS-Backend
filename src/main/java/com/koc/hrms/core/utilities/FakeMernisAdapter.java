package com.koc.hrms.core.utilities;

import com.koc.hrms.entities.concretes.JobSeeker;
import com.koc.hrms.ServiceMessageSimulation.MernisManager;
import org.springframework.stereotype.Service;

@Service
public class FakeMernisAdapter implements FakeMernisService {

    @Override
    public boolean auth(JobSeeker jobSeeker) {
        MernisManager mernisManager = new MernisManager();

        if (jobSeeker.getIdentificatioNumber().length() == 11 ) {
            mernisManager.mernis(jobSeeker.getFirstName());
            return true;
        } else
            return false;
    }
}
