package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.SocialMediaService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.SocialMediaDao;
import com.koc.hrms.entities.concretes.SocialMedia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialMediaManager implements SocialMediaService {

    private SocialMediaDao socialMediaDao;

    @Autowired
    public SocialMediaManager(SocialMediaDao socialMediaDao) {
        this.socialMediaDao = socialMediaDao;
    }

    @Override
    public Result add( SocialMedia socialMedia) {
        socialMediaDao.save(socialMedia);
        return new SuccessResult("Sosyal medya hesabınız başarılı bir şekilde eklenmiştir.");
    }

    @Override
    public DataResult<List<SocialMedia>> getAll() {
        return new SuccessDataResult<List<SocialMedia>>(socialMediaDao.findAll(),"Sayın tarık kaan koç sistemimizde mevcut olan tüm sosyal medya hesapları listelenmiştir.");
    }
}

