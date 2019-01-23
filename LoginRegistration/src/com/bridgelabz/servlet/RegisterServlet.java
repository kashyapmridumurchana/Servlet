package com.bridgelabz.servlet;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet
{
	//List<User> users=new ArrayList<User>();
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	{
		
//		User user=new User();
//		user.setName(request.getParameter("name"));
//		user.setPassword(request.getParameter("password"));
//		user.setEmail(request.getParameter("email"));
//		long telNo= Long.parseLong(request.getParameter("tel"));
//		user.setTel(telNo);
//		user.setAddress(request.getParameter("add"));
//		users.add(user);
//		display();
//	}
//
//	private void display()
//	{
//		for(User us:users)
//		{
//			System.out.println("Name is:" +us.getName());
//			System.out.println("Password is:" +us.getPassword());
//			System.out.println("Email id is:" +us.getEmail());
//			System.out.println("Telephone is:" +us.getTel());
//			System.out.println("Address is:" +us.getAddress());
//		}
//		
//	}
		
		
		String name=request.getParameter("name");
		System.out.println(name);
	    String password=request.getParameter("password");
	    System.out.println(password);
	    String email=request.getParameter("email");
	    System.out.println(email); 
	    long telNo= Long.parseLong(request.getParameter("tel"));
	    System.out.println(telNo);
	    String address=request.getParameter("add");
	    System.out.println(address);
	    
	    
	    User user=new User(name, password, email, telNo, address);
	    
	    
	    
	}   
	}

