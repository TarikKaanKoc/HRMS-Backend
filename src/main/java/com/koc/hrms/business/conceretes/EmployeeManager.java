package com.koc.hrms.business.conceretes;


import com.koc.hrms.business.abstracts.EmployeeService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.EmployeeDao;
import com.koc.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeManager implements EmployeeService {

    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public DataResult<List<Employee>> getAll() {
        return new SuccessDataResult<List<Employee>>(employeeDao.findAll(),"Sayın tarık kaan koç çalışan kullanıcılar listelenmiştir.");
    }

    @Override
    public Result add(Employee employee) {
        this.employeeDao.save(employee);
        return new SuccessResult("Sistem çalışanı başarılı bir şekilde eklenmiştir.");
    }
}
