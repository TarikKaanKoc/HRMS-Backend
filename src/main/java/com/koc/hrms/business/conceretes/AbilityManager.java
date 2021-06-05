package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.AbilityService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.AbilityDao;
import com.koc.hrms.entities.concretes.Ability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AbilityManager implements AbilityService {

    private AbilityDao abilityDao;

    @Autowired
    public AbilityManager(AbilityDao abilityDao) {
        this.abilityDao = abilityDao;
    }

    @Override
    public DataResult<List<Ability>> getAll() {
        return new SuccessDataResult<List<Ability>>(this.abilityDao.findAll(),"Sayın tarık kaan koç tüm yetenekler listelenmiştir.");
    }

    @Override
    public Result add(Ability ability) {
        this.abilityDao.save(ability);
        return new SuccessResult("Yetenek başarılı bir şekilde eklenmiştir.");
    }
}
