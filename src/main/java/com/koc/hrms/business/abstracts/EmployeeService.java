package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {

    DataResult<List<Employee>> getAll();
    Result add(Employee employee);

}
