package com.jesperapps.loginuser.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jesperapps.loginuser.message.LoginUserRequest;
import com.jesperapps.loginuser.message.LoginUserResponse;
import com.jesperapps.loginuser.model.LoginUser;
import com.jesperapps.loginuser.service.LoginUserServicelmpl;

@RestController
@RequestMapping("/Request")
public class UserController {
	
	@Autowired
	private LoginUserServicelmpl loginuserservice;
	
	@PostMapping("/addUser")
	public List<LoginUser> addUser(@RequestBody List<LoginUser> user1) {
		loginuserservice.addUser(user1);
		return user1;
	}
	
	@PostMapping("/login")
	public LoginUserResponse loginUser(@RequestBody LoginUserRequest userRequestingLogin) {
		LoginUser userFromDB = loginuserservice.getUserByEmail(userRequestingLogin.geteMail());
		LoginUserResponse response = new LoginUserResponse(200, "sucess");
		if(userFromDB != null) {
			if(loginuserservice.checkPasswordIsSame(userRequestingLogin.getuPwd(),userFromDB.getuPwd())) {
				return response;
			}
		}
		response.setStatusCode(400);
		response.setResponseMessage("Failure");
		return response;
		

}
}
