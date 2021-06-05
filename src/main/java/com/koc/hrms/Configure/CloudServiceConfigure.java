package com.koc.hrms.Configure;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudServiceConfigure {
    @Bean
    public Cloudinary cloudinaryService(){
        return new Cloudinary(
                ObjectUtils.asMap(
                        "cloud_name","dy8phfdri",
                        "api_key", "521194538775343",
                        "api_secret","SebA0thAjSI-B38vXvsH1Qc1ARs"
                )
        );
    }
}
