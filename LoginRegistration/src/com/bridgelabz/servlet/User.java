package com.bridgelabz.servlet;

public class User
{
String name;
String password;
String email;
long telno;


User()
{
	this.name=name;
	this.password=password;
	this.email=email;
	this.telno=telno;
	
}
public User(String name, String password, String email, long tel) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.telno = tel;
	
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
	return telno;
}
public void setTel(long tel) {
	this.telno = tel;
}




}
