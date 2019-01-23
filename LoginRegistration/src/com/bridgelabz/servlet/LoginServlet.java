package com.bridgelabz.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet
{


	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		handleRequest(request, response);

	}

	private void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		PrintWriter out = response.getWriter();

		out.write("<html><body><div id='serlvetResponse' style='text-align: center;'>");



		// Creating The 'RequestDispatcher' Object For Forwading The HTTP Request

		RequestDispatcher rdObj = null;

		// Checking For Null & Empty Values

		if(name == null || password == null || "".equals(name) || "".equals(password)) {

			out.write("<p id='errMsg' style='color: red; font-size: larger;'>Please Enter Both Username & Password... !</p>");

			rdObj = request.getRequestDispatcher("/LoginPage.html");

			rdObj.include(request, response);

		} else {

			System.out.println("Username?= " +name + ", Password?= " + password);

			// Authentication Logic & Building The Html Response Code

			if((name.equalsIgnoreCase(name)) && (password.equals(password))) {
				
				HttpSession session = request.getSession(true);
				session.setAttribute("user", name);
				//response.sendRedirect("/Logout.html");
				rdObj = request.getRequestDispatcher("/Logout.html");

				rdObj.forward(request, response);                   

			} else {

				out.write("<p id='errMsg' style='color: red; font-size: larger;'>You are not an authorised user! Please check with administrator!</p>");

				rdObj = request.getRequestDispatcher("/LoginPage.html");

				rdObj.include(request, response);

			}           

		}

		out.write("</div></body></html>");

		out.close();

	}



}




