package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.JobSeekerCv;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface JobSeekerCvDao extends JpaRepository<JobSeekerCv,Integer> {

    JobSeekerCv getByJobSeekerId(int jobSeekerId);
    JobSeekerCv findJobSeekerCvById(int jobSeekerId);

}
