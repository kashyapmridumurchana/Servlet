package com.bridgelabz.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		
		String name=request.getParameter("name");
		System.out.println(name);
	    String password=request.getParameter("password");
	    System.out.println(password);
	    String email=request.getParameter("email");
	    System.out.println(email); 
	    long telNo= Long.parseLong(request.getParameter("tel"));
	    System.out.println(telNo);
	  
	    
	    User user=new User(name, password, email, telNo);
	    
	    
	    
	}   
	}

