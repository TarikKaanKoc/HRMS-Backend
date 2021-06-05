package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.JobSeekerCvService;
import com.koc.hrms.core.utilities.cloudinary.Upload;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.JobSeekerCvDao;
import com.koc.hrms.entities.concretes.JobSeekerCv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

@Service
public class JobSeekerCvManager implements JobSeekerCvService {


    private JobSeekerCvDao jobSeekerCvDao;
    private Upload upload;

    @Autowired
    public JobSeekerCvManager(JobSeekerCvDao jobSeekerCvDao, Upload upload) {
        this.jobSeekerCvDao = jobSeekerCvDao;
        this.upload = upload;
    }

    @Override
    public DataResult<List<JobSeekerCv>> getAll() {
        return new SuccessDataResult<List<JobSeekerCv>>(jobSeekerCvDao.findAll(),"Tüm cv 'ler başarılı bir şekilde listelenmiştir");
    }

    @Override
    public Result add(JobSeekerCv jobSeekerCv) {
        this.jobSeekerCvDao.save(jobSeekerCv);
        return new SuccessResult("CV Başarılı bir şekilde eklenmiştir.");
    }

    @Override
    public Result uploadPhoto(MultipartFile file, int jobSeekerId) {
        JobSeekerCv jobSeekerCv = jobSeekerCvDao.getByJobSeekerId(jobSeekerId);
        Map<String,String> result =(Map<String, String>) upload.upload(file).getData();
        String url = result.get("url");
        jobSeekerCv.setCvPhotoUrl(url);
        jobSeekerCvDao.save(jobSeekerCv);
        return new SuccessResult("Başarılı bir şekilde yüklenmiştir.");
    }

    @Override
    public DataResult<JobSeekerCv> findJobSeekerCvById(int jobSeekerId) {
        return new SuccessDataResult<JobSeekerCv>
                (this.jobSeekerCvDao.findJobSeekerCvById(jobSeekerId),"İd'li kullanıcının Cv'leri başarılı bir şekilde listelenmiştir.");
    }

}
