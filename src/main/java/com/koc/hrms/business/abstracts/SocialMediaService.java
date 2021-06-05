package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.SocialMedia;

import java.util.List;

public interface SocialMediaService {

    Result add(SocialMedia socialMedia);
    DataResult<List<SocialMedia>> getAll();

}
