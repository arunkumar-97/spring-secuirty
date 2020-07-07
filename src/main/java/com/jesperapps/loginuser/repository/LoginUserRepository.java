package com.jesperapps.loginuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jesperapps.loginuser.model.LoginUser;

public interface LoginUserRepository extends JpaRepository<LoginUser, Integer> {
	
	LoginUser findByeMail(String eMail);

}
