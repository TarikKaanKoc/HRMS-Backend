package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.City;

import java.util.List;

public interface CityService {

    DataResult<List<City>> getAll();
    Result add(City city);

}
