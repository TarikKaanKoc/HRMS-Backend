package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.WorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkPlaceDao extends JpaRepository<WorkPlace,Integer> {
}
