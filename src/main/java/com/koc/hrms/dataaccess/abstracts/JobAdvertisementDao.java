package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.JobAdvertisement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement,Integer> {

    List<JobAdvertisement> getByEnableTrue();
    List<JobAdvertisement> getByEnableFalse();
    List<JobAdvertisement>getByEmployerId(int employerId);
    List<JobAdvertisement> getByEnableTrueAndEmployer_Id(int id); // Şu id'li

}
