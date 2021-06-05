package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
