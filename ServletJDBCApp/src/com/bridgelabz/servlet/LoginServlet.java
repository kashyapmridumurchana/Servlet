package com.bridgelabz.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.dbutil.MySQLConnUtils;
import com.bridgelabz.model.User;


public class LoginServlet extends HttpServlet
{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		response.setContentType("text/html");
		String name=request.getParameter("name");
		
		String password=request.getParameter("password");
		PrintWriter out = response.getWriter();

		out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");

		RequestDispatcher rdObj = null;
		User user=new User(0,name, password, null, 0);
		
		
		
		// Checking For Null & Empty Values

		if(name == null || password == null || "".equals(name) || "".equals(password)) {

			out.write("<p id='errMsg' style='color: red; font-size: larger;'>Please Enter Both Username & Password... !</p>");

			rdObj = request.getRequestDispatcher("/index.html");

			rdObj.include(request, response);

		}
		else
		{
			
			
			User user1=null;
			try {
				user1 = MySQLConnUtils.login(user);
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			if(user1!=null)
			{
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user1);
				Cookie ck=new Cookie("user",name);//creating cookie object  
				ck.setMaxAge(30*60);
			    response.addCookie(ck);//add
			   
				rdObj = request.getRequestDispatcher("/ProfilePage.jsp");

				rdObj.forward(request, response); 
				 
			      
			}
			else
			{
				out.write("<p id='errMsg' style='color: red; font-size: larger;'>You are not an authorised user! Please check with administrator!</p>");
				
							rdObj = request.getRequestDispatcher("/index.html");
				
								rdObj.include(request, response);
			}
		}
}
}




