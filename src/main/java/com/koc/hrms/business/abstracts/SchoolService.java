package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.School;

import java.util.List;

public interface SchoolService {

    DataResult<List<School>> getAllSorted();
    Result add (School school);
}
