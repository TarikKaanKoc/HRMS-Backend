package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.CityService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.CityDao;
import com.koc.hrms.entities.concretes.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public DataResult<List<City>> getAll() {
        return new SuccessDataResult<List<City>>(this.cityDao.findAll() ,"Sayın tarık kaan koç şehirler  listelendi");    }

    @Override
    public Result add(City city) {
        this.cityDao.save(city);
        return new SuccessResult("Şehir başarılı bir şekilde eklenmiştir.");
    }
}
