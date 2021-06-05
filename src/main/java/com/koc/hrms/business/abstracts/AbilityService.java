package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Ability;

import java.util.List;


public interface AbilityService {

    DataResult<List<Ability>> getAll();
    Result add(Ability ability);
}
