package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.JobSeekerCv;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface JobSeekerCvService {

    DataResult<List<JobSeekerCv>> getAll();
    Result add (JobSeekerCv jobSeekerCv);
    Result uploadPhoto(MultipartFile file,int candidateId);
    DataResult<JobSeekerCv> findJobSeekerCvById(int candidateId);


}
