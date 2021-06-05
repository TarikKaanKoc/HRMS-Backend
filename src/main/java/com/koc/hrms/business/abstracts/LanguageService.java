package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.Language;

import java.util.List;

public interface LanguageService {

    DataResult<List<Language>> getAll();
    Result add(Language language);

}
