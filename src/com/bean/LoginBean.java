package com.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {
	
	private String userName;
	private long password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getPassword() {
		return password;
	}
	public void setPassword(long password) {
		this.password = password;
	}

	public String login(){
		System.out.println("-------------------login Action ----------------");
		this.password= password+16;
		this.userName = "ahmed";
		return"";
	}
	
	
	
	
}
