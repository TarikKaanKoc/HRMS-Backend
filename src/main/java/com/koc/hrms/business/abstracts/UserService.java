package com.koc.hrms.business.abstracts;

import com.koc.hrms.core.utilities.results.DataResult;
import com.koc.hrms.core.utilities.results.Result;
import com.koc.hrms.entities.concretes.User;

import javax.xml.crypto.Data;
import java.util.List;

public interface UserService {

    DataResult<List<User>> getAll();
    Result add(User user);

}
