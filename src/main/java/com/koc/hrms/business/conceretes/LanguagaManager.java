package com.koc.hrms.business.conceretes;

import com.koc.hrms.business.abstracts.LanguageService;
import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.core.utilities.results.SuccessDataResult;
import com.koc.hrms.core.utilities.results.SuccessResult;
import com.koc.hrms.dataaccess.abstracts.LanguageDao;
import com.koc.hrms.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguagaManager implements LanguageService {

    private LanguageDao languageDao;

    @Autowired
    public LanguagaManager(LanguageDao languageDao) {
        this.languageDao = languageDao;
    }

    @Override
    public DataResult<List<Language>> getAll() {
        return new SuccessDataResult<List<Language>>(languageDao.findAll(),"Sistemde mevcut olan diller başarılı bir şeklilde listelenmiştir.");
    }

    @Override
    public Result add(Language language) {
        this.languageDao.save(language);
        return new SuccessResult("Sisteme yeni dil başarılı bir şekilde eklenmitşir.");
    }
}
