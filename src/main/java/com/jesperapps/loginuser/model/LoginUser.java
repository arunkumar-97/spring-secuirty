package com.jesperapps.loginuser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.jesperapps.loginuser.message.LoginUserRequest;;

@Entity
public class LoginUser {
	@Id
	private int uId;
	private String uName;
	private String uPwd;
	@Column(unique=true)
	private String eMail;
	
	public LoginUser() {
		super();
	}


	public LoginUser(LoginUserRequest userservicerequest) {
		this.eMail=userservicerequest.geteMail();
		this.uPwd=userservicerequest.getuPwd();
		
		
	}
	
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPwd() {
		return uPwd;
	}
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	
	
	

}
