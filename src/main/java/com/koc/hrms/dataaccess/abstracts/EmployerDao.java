package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.Employer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployerDao extends JpaRepository<Employer,Integer> {

    List<Employer> findAllByEmailAddress(String email);

}
