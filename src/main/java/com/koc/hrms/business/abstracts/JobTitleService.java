package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobTitle;

import javax.xml.crypto.Data;
import java.util.List;

public interface JobTitleService {

    DataResult<List<JobTitle>> getAll();
    Result add(JobTitle jobTitle);
}
