package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialMediaDao extends JpaRepository<SocialMedia,Integer> {
}
