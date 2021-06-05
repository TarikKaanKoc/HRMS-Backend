package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {

    DataResult<List<JobAdvertisement>> getAll();
    Result add(JobAdvertisement jobAdvertisement);
    Result update(JobAdvertisement jobAdvertisement);
    DataResult<List<JobAdvertisement>> getByEnableTrue();
    DataResult<List<JobAdvertisement>> getByEnableFalse();
    DataResult<List<JobAdvertisement>>getByEmployerId(int employerId);
    DataResult<List<JobAdvertisement>> getByEnableTrueAndEmployers_Id(int id);


}
