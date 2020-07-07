package com.jesperapps.loginuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.jesperapps.loginuser.model.LoginUser;
import com.jesperapps.loginuser.repository.LoginUserRepository;;


@Transactional
@Service
public class LoginUserServicelmpl implements LoginUserService{
	
	@Autowired
	private LoginUserRepository repository;
	
	public void addUser(List<LoginUser> user1) {
		for(LoginUser eachUser : user1) {
			eachUser.setuPwd(this.createSafePassword(eachUser.getuPwd()));
		}
		repository.saveAll(user1);
	}
	
	public LoginUser getUserByEmail(String email) {
		return repository.findByeMail(email);		
	}
	
	public String createSafePassword(String unsafePassword) {
		return BCrypt.hashpw(unsafePassword, BCrypt.gensalt());
	}
	
	public boolean checkPasswordIsSame(String unsafePassword, String hashedPassword) {
		return BCrypt.checkpw(unsafePassword, hashedPassword);
	}

	@Override
	public LoginUser save(LoginUser loginuser) {
		return repository.save(loginuser);
	}
}
