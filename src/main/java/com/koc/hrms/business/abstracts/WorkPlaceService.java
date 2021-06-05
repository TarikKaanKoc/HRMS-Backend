package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.WorkPlace;

import java.util.List;

public interface WorkPlaceService {

    DataResult<List<WorkPlace>> getAll();
    Result add(WorkPlace workPlace);

}
