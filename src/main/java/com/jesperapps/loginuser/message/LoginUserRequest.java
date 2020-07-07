package com.jesperapps.loginuser.message;

import com.jesperapps.loginuser.model.LoginUser;

public class LoginUserRequest {
	
	private String eMail;
	private String uPwd;
	
	private LoginUser userlogin;

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getuPwd() {
		return uPwd;
	}

	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}

	public LoginUser getUserlogin() {
		return userlogin;
	}

	public void setUserlogin(LoginUser userlogin) {
		this.userlogin = userlogin;
	}

	
	

}
