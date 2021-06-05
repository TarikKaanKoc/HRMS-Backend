package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {

    Result add(Employer employer);
    DataResult<List<Employer>>getAll();

}
