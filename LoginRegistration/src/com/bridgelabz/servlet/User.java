package com.bridgelabz.servlet;

public class User
{
String name;
String password;
String email;
long telno;
String address;

User()
{
	this.name=name;
	this.password=password;
	this.email=email;
	this.telno=telno;
	this.address=address;
}
public User(String name, String password, String email, long tel, String address) {
	super();
	this.name = name;
	this.password = password;
	this.email = email;
	this.telno = tel;
	address = address;
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
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	address = address;
}



}
