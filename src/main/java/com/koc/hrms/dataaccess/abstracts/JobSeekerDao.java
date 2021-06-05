package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {

    List<JobSeeker> findAllByEmailAddress(String email);

}
