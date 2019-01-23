package com.bridgelabz.model;

public class User
{
String name;
String password;
String email;
long telNo;


public User()
{
	this.name=name;
	this.password=password;
	this.email=email;
	this.telNo=telNo;
	
}

public User(String name, String password, String email, long tel) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.telNo = tel;
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getTel() {
	return telNo;
}
public void setTel(long tel) {
	this.telNo = tel;
}




}