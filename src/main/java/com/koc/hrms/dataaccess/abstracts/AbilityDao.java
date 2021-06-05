package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.Ability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbilityDao extends JpaRepository<Ability,Integer> {
}
