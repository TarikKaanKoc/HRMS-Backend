package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Integer> {
}
