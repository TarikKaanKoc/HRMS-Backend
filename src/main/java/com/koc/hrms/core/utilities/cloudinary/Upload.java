package com.koc.hrms.core.utilities.cloudinary;

import com.koc.hrms.core.utilities.results.DataResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

public interface Upload {

    DataResult<Map> upload(MultipartFile multiPartfile);

}
