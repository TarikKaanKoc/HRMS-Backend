package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobSeeker;
import com.koc.hrms.entities.concretes.JobSeekerCv;

import java.util.List;

public interface JobSeekerService {

    Result fakeMernis(JobSeeker jobSeeker);
    DataResult<List<JobSeeker>> getAll();
    Result add(JobSeeker jobSeeker);

}
