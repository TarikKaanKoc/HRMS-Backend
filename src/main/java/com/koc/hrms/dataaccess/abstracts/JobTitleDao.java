package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

    List<JobTitle> findAllByTitle(String title);

}
