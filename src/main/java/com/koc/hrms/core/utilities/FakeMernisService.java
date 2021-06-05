package com.koc.hrms.core.utilities;

import com.koc.hrms.entities.concretes.JobSeeker;

public interface FakeMernisService {

    boolean auth(JobSeeker jobSeeker);

}
