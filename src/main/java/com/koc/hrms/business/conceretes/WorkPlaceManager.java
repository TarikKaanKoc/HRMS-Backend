package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.WorkPlaceService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.WorkPlaceDao;
import com.koc.hrms.entities.concretes.WorkPlace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkPlaceManager implements WorkPlaceService {

    private WorkPlaceDao workPlaceDao;

    @Autowired
    public WorkPlaceManager(WorkPlaceDao workPlaceDao) {
        this.workPlaceDao = workPlaceDao;
    }

    @Override
    public DataResult<List<WorkPlace>> getAll() {
        return new SuccessDataResult<List<WorkPlace>>(this.workPlaceDao.findAll(),"İş yeri bilgisi listelenmiştir.");
    }

    @Override
    public Result add(WorkPlace workPlace) {
        this.workPlaceDao.save(workPlace);
        return new SuccessResult("İş bilgisi başarılı bir şekilde eklenmiştir.");
    }
}
