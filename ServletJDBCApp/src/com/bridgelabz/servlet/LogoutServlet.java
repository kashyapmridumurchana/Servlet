package com.bridgelabz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet 
{

	 
protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
//		String name=(String) session.getAttribute("user");
		 //session.setAttribute(name, null);
//		session.removeAttribute(name);
		 RequestDispatcher rd=request.getRequestDispatcher("/index.html");
		 rd.forward(request, response);
		
	
	}
}
