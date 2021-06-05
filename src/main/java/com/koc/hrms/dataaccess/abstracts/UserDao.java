package com.koc.hrms.dataaccess.abstracts;

import com.koc.hrms.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {

}
