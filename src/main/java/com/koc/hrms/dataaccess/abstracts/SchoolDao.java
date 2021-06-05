package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolDao extends JpaRepository<School,Integer> {

}

