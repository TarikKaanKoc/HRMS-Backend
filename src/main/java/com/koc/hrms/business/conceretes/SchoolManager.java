package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.SchoolService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.SchoolDao;
import com.koc.hrms.entities.concretes.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolManager implements SchoolService {

    private SchoolDao schoolDao;

    @Autowired
    public SchoolManager(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    @Override
    public Result add(School school) {
        this.schoolDao.save(school);
        return new SuccessResult("Sayın tarık kaan koç üniveriste başarılı bir şekilde sisteme eklenmiştir.");
    }


    @Override
    public DataResult<List<School>> getAllSorted() {

        Sort sort = Sort.by(Sort.Direction.ASC,"End Year");
        return new SuccessDataResult<List<School>>
                (this.schoolDao.findAll(sort), "Okullar başarılı bir şekilde listelenmiştir.");

    }
}
