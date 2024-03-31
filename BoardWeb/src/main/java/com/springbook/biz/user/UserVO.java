package com.springbook.biz.user;

public class UserVO {
	private String id;
	private String pw;
	private String name;
	private String rol;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return "UserVO [id = " + id + ", password = " + pw + ", name = " + name + ", role = " + rol +"]";
	}
	

}
